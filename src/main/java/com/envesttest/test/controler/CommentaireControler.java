package com.envesttest.test.controler;

import com.envesttest.test.DAO.BD;
import com.envesttest.test.metier.Commentaire;
import com.envesttest.test.metier.Topic;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CommentaireControler {
    BD bd = new BD();
    @RequestMapping(value="/Topic/{idT}/Post/{idP}/Commentaire", method = RequestMethod.POST)
    public void creatCommentaire(@PathVariable("idT") int idT, @PathVariable("idP") int idP,@RequestBody Commentaire commentaire){
        bd.createNewCommentaire(commentaire);
    }

    @RequestMapping(value="/Topic/{idT}/Post/{idP}/Commentaire", method = RequestMethod.GET)
    public ArrayList<Commentaire> getTopic(@PathVariable("idT") int idT, @PathVariable("idP") int idP){
        return bd.getAllCommentaire();
    }

    @RequestMapping(value = "/Topic/{idT}/Post/{idP}/Commentaire", method = RequestMethod.PUT)
    public void updateTopic(@PathVariable("idT") int idT, @PathVariable("idP") int idP, @RequestParam(value="idC", required = true) int idC, int idChange){
        bd.updateCommentaire(idT, idP, idC, idChange);
    }

    @RequestMapping(value = "Topic/{idT}/Post/{idP}/Commentaire", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable("idT") int idT, @PathVariable("idP") int idP, @RequestParam(value="idC", required = true) int idC){
        bd.deleteCommentaire(idT, idP, idC);
    }
}
