/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import domen.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author student1
 */
public class ServiceUserImpl implements service.ServiceUser {

    @Override
    public User login(String email, String password) throws Exception {
        EntityManager entityManager= Persistence.createEntityManagerFactory("MyWebAppPU").createEntityManager();
       List<User> users = entityManager.createQuery("SELECT u FROM User u where u.email=:p1 and u.password=:p2").setParameter("p1",email).setParameter("p2",password).getResultList();
    if(users.isEmpty()) throw new Exception("User doesnt exist");
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {entityManager.close();
            return user;
                
            }
        }entityManager.close();throw new Exception("User doesnt exist");
                
    }

}
