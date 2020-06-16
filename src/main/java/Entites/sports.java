/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import java.util.Date;

/**
 *
 * @author rcorroch
 */
public class sports {
    int id;
    String type;
    String nbSeances;
    Double dureeDeSeances;
    int intensite;
    Date date;
    User idUser;

    public sports() {
    }

    public sports(int id, String type, String nbSeances, Double dureeDeSeances, int intensite, Date date) {
        this.id = id;
        this.type = type;
        this.nbSeances = nbSeances;
        this.dureeDeSeances = dureeDeSeances;
        this.intensite = intensite;
        this.date = date;
    }

    public sports(int id, String type, String nbSeances, Double dureeDeSeances, int intensite) {
        this.id = id;
        this.type = type;
        this.nbSeances = nbSeances;
        this.dureeDeSeances = dureeDeSeances;
        this.intensite = intensite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNbSeances() {
        return nbSeances;
    }

    public void setNbSeances(String nbSeances) {
        this.nbSeances = nbSeances;
    }

    public Double getDureeDeSeances() {
        return dureeDeSeances;
    }

    public void setDureeDeSeances(Double dureeDeSeances) {
        this.dureeDeSeances = dureeDeSeances;
    }

    public int getIntensite() {
        return intensite;
    }

    public void setIntensite(int intensite) {
        this.intensite = intensite;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
