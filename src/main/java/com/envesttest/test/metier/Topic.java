package com.envesttest.test.metier;

import java.util.ArrayList;
import java.util.HashMap;

public class Topic {
    private int idT;
    private String nomT;
    private HashMap<Integer,Post> post;

    public Topic(int idT, String nomT) {
        this.idT = idT;
        this.nomT = nomT;
    }

    public Topic() {
    }

    public int getIdT() {
        return idT;
    }

    public void setIdT(int idT) {
        this.idT = idT;
    }

    public String getNomT() {
        return nomT;
    }

    public void setNomT(String nomT) {
        this.nomT = nomT;
    }

    public HashMap<Integer, Post> getPost() {
        return post;
    }

    public void setPost(HashMap<Integer, Post> post) {
        this.post = post;
    }
}
