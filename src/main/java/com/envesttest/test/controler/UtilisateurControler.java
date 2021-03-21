package com.envesttest.test.controler;

import com.envesttest.test.DAO.BD;
import com.envesttest.test.metier.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class UtilisateurControler {
    BD bd = new BD();

    @RequestMapping(value="/Utilisateur", method = RequestMethod.POST)
    public void creatUtilisateur(@RequestBody Utilisateur utilisateur){
        bd.createNewUtilisateur(utilisateur);
    }

    @RequestMapping(value="/Utilisateur", method = RequestMethod.GET)
    public HashMap<Integer,Utilisateur> addUtilisateur(){
        return bd.getAllUtilisateur();
    }

    @RequestMapping(value="/Utilisateur/Login", method=RequestMethod.POST)
    public void loginUtilisateur(@RequestParam(value="emailU", required = true) String emailU, @RequestParam(value="mdpU", required = true) String mdpU){
        bd.loginUtilisateur(emailU,mdpU);
    }

    @RequestMapping(value = "/Utilisateur/{idU}", method = RequestMethod.PUT)
    public void updateUtilisateur(@PathVariable("idU") int id, @RequestBody Utilisateur utilisateur, String mdpU){
        bd.updateUtilisateurId(id,mdpU);
    }

    @RequestMapping(value = "Utilisateur/{idU}", method = RequestMethod.DELETE)
    public void deleteUtilisateur(@PathVariable("idU") int id){
        bd.deleteUtilisateur(id);
    }

}
