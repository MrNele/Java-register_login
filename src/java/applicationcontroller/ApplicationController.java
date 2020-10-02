/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller;

import action.AbstractAction;
import action.impl.LoginAction;
import action.impl.RegisterAction;
import action.impl.SaveUserAction;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author student1
 */
public class ApplicationController {

    public String handleRequest(HttpServletRequest request) {
        String page = "/pages/login.jsp";
        String pathInfo = request.getPathInfo();

        if (pathInfo.equalsIgnoreCase("/login")) {
            //korisnik kliknuo na dugme login
            AbstractAction action = new LoginAction();
            try {
                action.executeAction(request);
                page = "/WEB-INF/pages/welcome.jsp";
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                page = "/pages/login.jsp";
                request.setAttribute("error", ex.getMessage());
            }
        }
        if (pathInfo.equalsIgnoreCase("/registerView")) {
            //korisnik kliknuo na dugme login
            page = "/pages/register.jsp";
        }

        if (pathInfo.equalsIgnoreCase("/register")) {
            //korisnik kliknuo na dugme register
            AbstractAction action = new RegisterAction();
            try {
                action.executeAction(request);
                page = "/pages/login.jsp";
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                page = "/pages/register.jsp";
                request.setAttribute("error", ex.getMessage());
            }
        }

        if (pathInfo.equalsIgnoreCase("/newUser")) {
            page = "/WEB-INF/pages/new_user.jsp";
        }
        
        if (pathInfo.equalsIgnoreCase("/saveUser")) {
            AbstractAction action = new SaveUserAction();
            try {
               action.executeAction(request);
               page = "/WEB-INF/pages/welcome.jsp";
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                page = "/WEB-INF/pages/new_user.jsp";
                request.setAttribute("error", ex.getMessage());
            }
        }
        return page;
    }

}
