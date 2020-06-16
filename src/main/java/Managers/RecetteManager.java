/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Entites.Recette;
import java.util.ArrayList;

/**
 *
 * @author rcorroch
 */
public class RecetteManager {
    private static ArrayList<Recette> recette;
    static{
        String[] ingredientsPesto={"90 g (3 tasses) de basilic frais, tassé","65 g (1/2 tasse) de noix de pin, grillées","35 g (1/2 tasse) de fromage parmesan frais râpé","15 ml (1 c. à soupe) de jus de citron","2 gousses d'ail, coupées en morceaux","375 ml (1 1/2 tasse) d'huile d'olive, environ"};
        String[] ProcedurePesto={"Au robot culinaire, hacher finement le basilic, les noix de pin, le parmesan, le jus de citron et l'ail"," Incorporer l'huile en filet jusqu'à ce que le mélange ait une consistance crémeuse et légèrement granuleuse.","Saler.","Le pesto se conserve 2 semaines dans un contenant hermétique au réfrigérateur ou congeler."};
    recette.add(new Recette("entree", "pesto au basilic", "facil", "4", ingredientsPesto, ProcedurePesto, "pesto.jpg"));
    String[] ingredientsRizBrun={"285 g (1 1/2 tasse) de riz basmati brun, rincé et égoutté","90 g (1/2 tasse) de quinoa, rincé et égoutté","750 ml (3 tasses) de bouillon de champignons ou de légumes","60 ml (1/4 tasse) d’huile d’olive","2 gousses d’ail, hachées","2 gousses de cardamome (facultatif)","1 bâton de cannelle de 3 cm (1 1/4 po) de long","2,5 ml (1/2 c. à thé) de curcuma moulu","4 gros oignons, émincés","1 boîte de 398 ml (14 oz) de lentilles brunes, rincées et égouttées","125 ml (1/2 tasse) de yogourt grec nature","5 ml (1 c. à thé) de cumin moulu","10 g (1/4 tasse) de coriandre ciselée","Quartiers de citron, pour le service"};
    String[] procedureRizBrun={"Dans une casserole, mélanger le riz, le quinoa, le bouillon, 15 ml (1 c. à soupe) de l’huile, l’ail, la cardamome, la cannelle et le curcuma. Saler et poivrer. Porter à ébullition, couvrir et laisser mijoter à feu doux 20 minutes. Retirer du feu et laisser reposer 5 minutes à couvert. Retirer les gousses de cardamome et le bâton de cannelle.","Entre-temps, dans une grande poêle à feu élevé, dorer les oignons dans le reste de l’huile en remuant presque continuellement jusqu’à ce qu’ils soient bien dorés, soit environ 10 minutes. Réserver.","Incorporer les lentilles au riz, puis transférer dans une grande assiette de service. Garnir des oignons caramélisés et du yogourt. Saupoudrer de cumin, parsemer de coriandre et accompagner de quartiers de citron."};
    recette.add(new Recette("plat principaux","Riz brun aux lentilles et aux oignons caramélisés","medium","4 a 6 ",ingredientsRizBrun,procedureRizBrun,"rizbrun.jpg"));
    String[] ingredientsChili={"2 oignons, émincés.","2 gousses d’ail, hachées","30 ml (2 c. à soupe) d’huile végétale\n","2 poivrons jaunes, épépinés et coupés en gros dés","30 ml (2 c. à soupe) d’assaisonnement au chili","2 boîtes de 540 ml (19 oz) de tomates en dés","1 boîte de 540 ml (19 oz) de haricots rouges sans sel ajouté, rincés et égouttés","290 g (2 tasses) d’edamames écossés surgelés","120 g (1 tasse) de haricots verts coupés en tronçons","30 ml (2 c. à soupe) de mélasse"};
    String[] procedureChili={"Dans une grande casserole à feu moyen, attendrir les oignons et l’ail dans l’huile. Ajouter les poivrons et l’assaisonnement au chili. Cuire 1 minute en remuant. Ajouter le reste des ingrédients. Saler et poivrer.","Porter à ébullition et laisser mijoter à feu moyen 30 minutes en remuant régulièrement. Ajouter de l’eau si le chili est trop épais.","Servir avec la crème sure et garnir de coriandre."};
    recette.add(new Recette("plat principaux","Chili végétarien aux edamames","facil", "4 a 6", ingredientsChili, procedureChili, "chili.jpg"));
    String[] ingredientsSaladeQuinoa={"180 g (1 tasse) de quinoa, rincé et égoutté","200 g (2 tasses) de chou rouge coupé en dés","1 ml (1/4 c. à thé) de sel","1 ml (1/4 c. à thé) de sucre","45 ml (3 c. à soupe) de vinaigre de riz","300 g (2 tasses) de radis, tranchés finement","1 pamplemousse, les suprêmes coupés en petits morceaux","15 g (1/2 tasse) de feuilles de persil plat","30 ml (2 c. à soupe) d’huile d’olive","120 g (1 tasse) de fromage feta émietté","55 g (1/3 tasse) de graines de citrouille"};
    String[] procedureSaladeQuinoa={"Dans une casserole d’eau bouillante salée, cuire le quinoa 10 minutes ou jusqu’à ce qu’il soit tendre. Égoutter, huiler légèrement et réserver.","Entre-temps, dans un grand bol, mélanger le chou, le sel, le sucre et 30 ml (2 c. à soupe) du vinaigre de riz. Laisser macérer 15 minutes.","Incorporer les radis, le pamplemousse, le persil, l’huile et le reste du vinaigre. Saler et poivrer.","Répartir le quinoa dans les assiettes. Garnir du mélange de chou, puis parsemer du fromage et des graines de citrouille. Arroser d’un filet d’huile, si désiré.","Parfait pour le lunch ou délicieux en accompagnement avec un poulet rôti."};
    recette.add(new Recette("plat principaux","Salade croquante au quinoa, chou, radis et feta","facil", "4 a 6", ingredientsSaladeQuinoa, procedureSaladeQuinoa, "saladequinoa.jpg"));
    
    }
       public static ArrayList<Recette> getAll(){
       return recette;
   } 
    
    
}
