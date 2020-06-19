/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Entites.MenuNutritionel;
import Entites.Metabolisme;
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
        menus.add(new MenuNutritionel(2, "423 gr glucides(60% des calories), 130 gr de proteines (18% des calories), 70 gr de lipides (22% de calories)", "jus de orange (250ml), gruu nature cuit (360 ml), cassonade (15 ml)", "ananas frais (180 ml), biscuits arrow-root(3)", "jus de legumes (125 ml), sandwich au saumon : pain pita de ble entier (1 petit), saumon rose en conserve(75 g), mozzarella 17% M.G(30 gr), mayo(5 ml), choux fleur (5 bouquets), carrotes miniatures(7), biscuits doigts de dame(2), orange(1)", "barre de cereales(1), jus de fruits (250ml)", "baquette ble entier (10cm ), beurre(5 ml), omelette : oeufs(2). epinard cuits(125 ml). ognion(125 ml). tomate(1 moyenne). jambon 5% M.G (45g). mozarella 17% M.G (30 gr), lait(500 ml), biscuit aux figues(2)"));
        menus.add(new MenuNutritionel(3, "421 gr glucides(59% des calories), 130 gr de proteines (18% des calories), 72 gr de lipides (23% de calories)", "pamplemouse(1), pain aux raisin (2 tranches), fromage a la creme(15 ml), miel(15 ml), lait 1% M.G(500 ml)", "cantaloup (1 tranche de 2cm x 15cm), biscuit arrow root(3)" , "jus de legumes(125 ml), roule: tortillas(2 petits), poitrine de poulet fume(90 gr). fromage de chevre 12% M.G (45 g), chou-fleur( 5 bouquets), celeri(4 tiges), vinaigraite cremeuse (20 ml),biscuits uax figues(2), poire(1)", "1 bagel (gros), beurre de arrachide(30 ml)", "penne sauce tomate et thon: penne cuits(160 ml). thon en conserve dans l'eau(185 ml). mozarella 17% M.G (30 gr). sauce tomate (125 ml). courgette (1 petite). champignons cuits(125 ml), jus de fruits(250 ml)"));
        menus.add(new MenuNutritionel(1,"220 gr glucides(58% des calories), 78 gr de proteines (21% des calories), 35 gr de lipides (21% de calories)" , "jus de orange(125 ml), pain au ble(1 tranche) avec beurre (5 ml),oeuf (1), lait 1%(125 ml)", "raisins frais(15), feves de soja(45 ml)", "jus de legumes (125 ml), pita au poulet: pain pita( circunference de 16.5 cm). poulet (30 gr), carrotes miniatures (7), celeri(4),compote des pommes sans sucre(125 ml)", "yougourt aux fruits 2% M.G(175 g)", "filet de porc a l'asiatique : filet de porc (60 gr). champignons cuits(125 ml). poids mange-tout cuits(125 ml). poivron rouge cuit(1/2). riz brun cuit(120 ml), lait 1% M.G(125 ml), salade de fruits(125 ml)"));
    }

    public static ArrayList<MenuNutritionel> getAll() {
        return menus;
    }
    public static ArrayList<MenuNutritionel> getByIdCategorie(int idCategorie) {
        ArrayList<MenuNutritionel> retour = new ArrayList<>();
        for (MenuNutritionel m : menus) {
            if (m.getCategorie() == idCategorie) {
                retour.add(m);
            }
        }
        return retour;
    }
}
