package com.envesttest.test.DAO;

import com.envesttest.test.metier.Commentaire;
import com.envesttest.test.metier.Post;
import com.envesttest.test.metier.Topic;
import com.envesttest.test.metier.Utilisateur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BD {
    //Initialiation de base de données
    static HashMap<Integer, Utilisateur> listU = new HashMap<>();
    static HashMap<Integer, Post> listP = new HashMap<>();
    static HashMap<Integer, Commentaire> listC = new HashMap<>();
    static HashMap<Integer, Topic> listT = new HashMap<>();

    static HashMap<String, String> listM = new HashMap<>(); //Stocker les email et les mdps le login

    static {
        Utilisateur u1 = new Utilisateur(1, "DUAN", "Chengyu", "duanchengyu995@gmail.com", "123456", "active");
        u1.setIdU(1);
        listU.put(u1.getIdU(), u1);
        listM.put(u1.getEmailU(), u1.getMdp());

        Utilisateur u2 = new Utilisateur(2, "DUAN", "Chengyu", "13520353148@163.com", "123456", "active");
        listU.put(u2.getIdU(), u2);

        Topic t1 = new Topic();
        t1.setIdT(1);
        t1.setNomT("Spring");
        listT.put(t1.getIdT(), t1);

        Post p1 = new Post();
        p1.setIdP(1);
        p1.setTitreP("Springboot");
        p1.setCorpsP("start up with springboot");
        p1.setMediaP("txt");
        listP.put(p1.getIdP(), p1);

        Commentaire c1 = new Commentaire();
        c1.setIdC(1);
        c1.setCorpC("très bonne post");

        listC.put(c1.getIdC(), c1);

    }

    //Tous les methode pour utilisateurs
    public HashMap<Integer, Utilisateur> getAllUtilisateur() {
        return listU;
    }

    public void loginUtilisateur(String email, String mdpU) {
        try {
            String mdp;
            mdp = listM.get(email);
            if (mdp == null) {
                System.out.println("Please check your id");
            } else {
                if (mdp.equals(mdpU)) {
                    System.out.println("Login success");
                } else {
                    System.out.println("Please check your password");
                }
            }
        } catch (Exception e) {

        }
    }

    public void updateUtilisateurId(int id, String mdpU) {
        Utilisateur u = listU.get(id);
        listU.put(id, u);
    }

    public void deleteUtilisateur(int id) {
        listU.remove(id);
    }

    public void createNewUtilisateur(Utilisateur utilisateur) {
        listU.put(utilisateur.getIdU(), utilisateur);
    }

    //Tous les methode de Topic
    public HashMap<Integer, Topic> getAllTopic() {
        return listT;
    }

    public void createNewTopic(Topic topic) {
        listT.put(topic.getIdT(), topic);
    }

    public void updateTopic(int idT, String nomT) {
        Topic t = listT.get(idT);
        t.setNomT(nomT);
        listT.put(idT, t);
    }

    public void deleteTopic(int id) {
        listT.remove(id);
    }

    public Topic chercheTopic(String nomT) {

        for(Topic t : listT.values()){
            if(t.getNomT().equals((nomT))){
                return t;
            }
        }
        return null;
    }

    public HashMap<Integer, Post> getAllPost(int idT) {
        return listP;
    }

    public void createNewPost(int idT, Post post) {
        listP.put(post.getIdP(), post);
        listT.get(idT).getPost().put(post.getIdP(), post);
    }

    public void updatePost(int idT, int idP, String corpsChange) {
        Post p1 = listT.get(idT).getPost().get(idP);
        p1.setCorpsP(corpsChange);
        listP.put(idP, p1);
        listT.get(idT).getPost().put(idP, p1);
    }

    public void deletePost(int idT, int idP) {
        listT.get(idT).getPost().remove(idP);
        listP.remove(idP);
    }

    public Post cherchePost(String titreP) {
        for (Post p : listP.values()){
            if(p.getTitreP().equals(titreP)){
                return p;
            }
        }
        return null;
    }

    public HashMap<Integer, Commentaire> getAllCommentaire() {
        return listC;
    }

    public void createNewCommentaire(int idT, int idP, Commentaire commentaire) {
        listC.put(commentaire.getIdC(), commentaire);
        listT.get(idT).getPost().get(idP).getCommentaire().put(commentaire.getIdC(), commentaire);
    }

    public void updateCommentaire(int idT, int idP, int idC, String corpC) {
        Commentaire c = listT.get(idT).getPost().get(idP).getCommentaire().get(idC);
        c.setCorpC(corpC);
        listC.put(idC, c);
        listT.get(idT).getPost().get(idP).getCommentaire().put(idC, c);
    }

    public void deleteCommentaire(int idT, int idP, int idC) {
        listC.remove(idC);
        listT.get(idT).getPost().get(idP).getCommentaire().remove(idC);
    }
}
