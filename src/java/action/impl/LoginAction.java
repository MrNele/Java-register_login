/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action.impl;

import action.AbstractAction;
import domain.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import service.ServiceUser;
import service.impl.ServiceUserImpl;

/**
 *
 * @author student1
 */
public class LoginAction extends AbstractAction {
    private final ServiceUser serviceUser;

    public LoginAction() {
        serviceUser = new ServiceUserImpl();
    }
    
    @Override
    public void executeAction(HttpServletRequest request) throws Exception {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (email.isEmpty()) {
            throw new Exception("Email is emmpty");
        }
        if (password.isEmpty()) {
            throw new Exception("Password is emmpty");
        }
        
        User user = serviceUser.login(email, password);
        HttpSession session = request.getSession(true);
        session.setAttribute("user", user);
    }

}
