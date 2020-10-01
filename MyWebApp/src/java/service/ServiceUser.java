/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domen.User;

/**
 *
 * @author student1
 */
public interface ServiceUser {
    User login(String email, String password) throws Exception;
}
