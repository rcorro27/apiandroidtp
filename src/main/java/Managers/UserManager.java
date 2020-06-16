/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Entites.User;
import java.util.ArrayList;

/**
 *
 * @author rcorroch
 */
public class UserManager {
   private static ArrayList<User> user;
   static{
   user = new ArrayList<>();
   user.add(new User(1, "toto", "titi", 20, "titi@gmail.com", "male", "titi24", "test"));
   }
   public static ArrayList<User> getAll(){
       return user;
   }  
}
