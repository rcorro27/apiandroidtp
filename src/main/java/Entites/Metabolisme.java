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
public class Metabolisme {

    int idCategorie;
    String titre;
    String categorie;
    String message;

    public Metabolisme() {
    }

    public Metabolisme(String titre, String categorie, String message) {
        this.titre = titre;
        this.categorie = categorie;
        this.message = message;
    }

    public Metabolisme(int idCategorie, String titre, String categorie, String message) {
        this.idCategorie = idCategorie;
        this.titre = titre;
        this.categorie = categorie;
        this.message = message;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

}
