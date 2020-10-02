/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action.impl;

import action.AbstractAction;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author student1
 */
public class RegisterAction extends AbstractAction {

    @Override
    public void executeAction(HttpServletRequest request) throws Exception {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");

        StringBuilder error = new StringBuilder();
        if (email.isEmpty()) {
            error.append("<h3>Email is empty</h3>");
        }
        if (password.isEmpty()) {
             error.append("<h3>Password is empty</h3>");
        }
        if (firstname.isEmpty()) {
             error.append("<h3>Firstname is empty</h3>");
        }
        if (lastname.isEmpty()) {
             error.append("<h3>Lastname is empty</h3>");
        }
        if (!error.toString().isEmpty()) throw new Exception(error.toString());
    }

}
