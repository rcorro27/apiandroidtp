/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author rcorroch
 */
public class Recette {
String categorie;
String titre;
String level;
String portions;
String[] ingredients;
String[] procedure;
String photo;

    public Recette() {
    }

    public Recette(String titre, String level, String portions, String[] ingredients, String[] procedure, String photo) {
        this.titre = titre;
        this.level = level;
        this.portions = portions;
        this.ingredients = ingredients;
        this.procedure = procedure;
        this.photo = photo;
    }

    public Recette(String categorie, String titre, String level, String portions, String[] ingredients, String[] procedure, String photo) {
        this.categorie = categorie;
        this.titre = titre;
        this.level = level;
        this.portions = portions;
        this.ingredients = ingredients;
        this.procedure = procedure;
        this.photo = photo;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPortions() {
        return portions;
    }

    public void setPortions(String portions) {
        this.portions = portions;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
}


