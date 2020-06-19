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
public class MenuNutritionel {

    int categorie;
    String pourcentage;
    String petitDejeuner;
    String collationMatin;
    String dejeuner;
    String collationApresMidi;
    String diner;

    public MenuNutritionel() {
    }

    public MenuNutritionel(int categorie, String pourentage, String petitDejeuner, String collationMatin, String dejeuner, String collationApresMidi, String diner) {
        this.categorie = categorie;
        this.pourcentage = pourentage;
        this.petitDejeuner = petitDejeuner;
        this.collationMatin = collationMatin;
        this.dejeuner = dejeuner;
        this.collationApresMidi = collationApresMidi;
        this.diner = diner;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public String getPourentage() {
        return pourcentage;
    }

    public void setPourentage(String pourentage) {
        this.pourcentage = pourentage;
    }

    public String getPetitDejeuner() {
        return petitDejeuner;
    }

    public void setPetitDejeuner(String petitDejeuner) {
        this.petitDejeuner = petitDejeuner;
    }

    public String getCollationMatin() {
        return collationMatin;
    }

    public void setCollationMatin(String collationMatin) {
        this.collationMatin = collationMatin;
    }

    public String getDejeuner() {
        return dejeuner;
    }

    public void setDejeuner(String dejeuner) {
        this.dejeuner = dejeuner;
    }

    public String getCollationApresMidi() {
        return collationApresMidi;
    }

    public void setCollationApresMidi(String collationApresMidi) {
        this.collationApresMidi = collationApresMidi;
    }

    public String getDiner() {
        return diner;
    }

    public void setDiner(String diner) {
        this.diner = diner;
    }
}
