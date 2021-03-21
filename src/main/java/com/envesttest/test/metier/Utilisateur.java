package com.envesttest.test.metier;

import java.util.ArrayList;
import java.util.HashMap;

public class Utilisateur {
    private int idU;
    private String nomU;
    private String prenomU;
    private String emailU;
    private String mdp;
    private String statut;
    private HashMap<Integer,Commentaire> commentaire;
    private HashMap<Integer,Post> post;

    public Utilisateur(int idU, String nomU, String prenomU, String emailU, String mdp, String statut) {
        this.idU = idU;
        this.nomU = nomU;
        this.prenomU = prenomU;
        this.emailU = emailU;
        this.mdp = mdp;
        this.statut = statut;
    }

    public Utilisateur() {
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public String getNomU() {
        return nomU;
    }

    public void setNomU(String nomU) {
        this.nomU = nomU;
    }

    public String getPrenomU() {
        return prenomU;
    }

    public void setPrenomU(String prenomU) {
        this.prenomU = prenomU;
    }

    public String getEmailU() {
        return emailU;
    }

    public void setEmailU(String emailU) {
        this.emailU = emailU;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public HashMap<Integer, Commentaire> getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(HashMap<Integer, Commentaire> commentaire) {
        this.commentaire = commentaire;
    }

    public HashMap<Integer, Post> getPost() {
        return post;
    }

    public void setPost(HashMap<Integer, Post> post) {
        this.post = post;
    }
}
