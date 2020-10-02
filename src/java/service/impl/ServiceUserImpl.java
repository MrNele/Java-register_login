/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import domain.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import service.ServiceUser;

/**
 *
 * @author student1
 */
public class ServiceUserImpl implements ServiceUser {

    @Override
    public User login(String email, String password) throws Exception {
        EntityManager entityManager = Persistence.createEntityManagerFactory("MyWebAppPU")
                .createEntityManager();
        List<User> users = entityManager.createQuery("select u from User u where u.email=:p1 and u.password=:p2")
                .setParameter("p1", email).setParameter("p2", password)
                .getResultList();

        if (users.isEmpty()) {
            entityManager.close();
            throw new Exception("User does not exist");
        }
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)
                    && user.getPassword().equals(password)) {
                entityManager.close();
                return user;
            }
        }
        entityManager.close();
        throw new Exception("User does not exist");
    }

    @Override
    public User save(User user) throws Exception {
        EntityManager entityManager = Persistence.createEntityManagerFactory("MyWebAppPU")
                .createEntityManager();
                
        entityManager.getTransaction().begin();
        User dbUser = entityManager.merge(user);
        System.out.println("User id:"+dbUser.getId());
        entityManager.getTransaction().commit();
        
        entityManager.close();
        return dbUser;

    }

    @Override
    public List<User> findAll() {
        EntityManager entityManager=Persistence.createEntityManagerFactory("MyWebApp").createEntityManager();
        return null;
    }

}
