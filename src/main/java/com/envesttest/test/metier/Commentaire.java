package com.envesttest.test.metier;

public class Commentaire {
    private int idC;
    private String corpC;
    private int idP;
    private int idU;

    public Commentaire(int idC, String corpC, Utilisateur utilisateur, Post post) {
        this.idC = idC;
        this.corpC = corpC;
    }

    public Commentaire() {
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getCorpC() {
        return corpC;
    }

    public void setCorpC(String corpC) {
        this.corpC = corpC;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }
}
