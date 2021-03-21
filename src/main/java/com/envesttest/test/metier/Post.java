package com.envesttest.test.metier;

import java.util.ArrayList;
import java.util.HashMap;

public class Post {
    private int idP;
    private String titreP;
    private String mediaP;
    private String corpsP;
    private int idU;
    private int idT;
    private HashMap<Integer, Commentaire> commentaire;

    public Post(int idP, String titreP, String mediaP, String corpsP) {
        this.idP = idP;
        this.titreP = titreP;
        this.mediaP = mediaP;
        this.corpsP = corpsP;
    }

    public Post() {
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getTitreP() {
        return titreP;
    }

    public void setTitreP(String titreP) {
        this.titreP = titreP;
    }

    public String getMediaP() {
        return mediaP;
    }

    public void setMediaP(String mediaP) {
        this.mediaP = mediaP;
    }

    public String getCorpsP() {
        return corpsP;
    }

    public void setCorpsP(String corpsP) {
        this.corpsP = corpsP;
    }

    public HashMap<Integer, Commentaire> getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(HashMap<Integer, Commentaire> commentaire) {
        this.commentaire = commentaire;
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public int getIdT() {
        return idT;
    }

    public void setIdT(int idT) {
        this.idT = idT;
    }
}
