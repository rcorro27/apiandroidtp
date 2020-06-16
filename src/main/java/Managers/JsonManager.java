/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;
import com.google.gson.Gson;
import Entites.*;
import java.util.ArrayList;
/**
 *
 * @author jlidou
 */
public class JsonManager {
    public static String Stringify(Object object) {
        return new Gson().toJson(object);
    }
}
