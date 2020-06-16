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
public class Photos {
 int id;
 String photo;
 String photo2;
 String photo3;
 Date date;
 User idUser;

    public Photos() {
    }

    public Photos(int id, String photo, String photo2, String photo3, Date date, User iduser) {
        this.id = id;
        this.photo = photo;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.date = date;
        this.idUser = iduser;
    }

    public Photos(int id, String photo, String photo2, String photo3, Date date) {
        this.id = id;
        this.photo = photo;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public String getPhoto3() {
        return photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getIduser() {
        return idUser;
    }

    public void setIduser(User iduser) {
        this.idUser = iduser;
    }

}
