/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Entites.MenuNutritionel;
import java.util.ArrayList;

/**
 *
 * @author rcorroch
 */
public class MenuManager {

    private static ArrayList<MenuNutritionel> menus;

    static {
        menus = new ArrayList<>();
        menus.add(new MenuNutritionel(4, "606 gr glucides(60% des calories), 172 gr de proteines (17% des calories), 103 gr de lipides (23% de calories)", "jus de orange (250ml) , cereales muslix (250 ml), lait 2% M.G (250 ml), pain ble entier (2 tranches), confiture de fraises (15 ml),beuree de arrachides cremeux (30 ml)", "pruner (2), biscuits au gingembre, yougourt aux fruits 2% M.G (175 g).", "jus de legumes (250 ml), BAGEL AU ROTI DE BOEUF : bagel de ble entier (1.) roti de bouef(120 g). laitue boston  tomates (1/2).  fromage gouda (60 gr). moutarde (15 ml), carrotes miniature (7), tomates cerises (8), biscuit a l'avoine (2 petits), jus de pomme (250 ml)", "lait au chocolat (500 ml), banane (1), biscuits minces aux legumes(30), fromage edam (90 gr), jus de fruits (250 ml)", "fettucini (250 ml) avec : poitrine de poulet cuit (60 gr). brocoli cuit (3 bouquets) et sauce tomate (125 ml), jus de fruits (250 ml), biscuit au figues(2)"));

    }

    public static ArrayList<MenuNutritionel> getAll() {
        return menus;
    }
}
