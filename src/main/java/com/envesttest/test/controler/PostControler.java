package com.envesttest.test.controler;

import com.envesttest.test.DAO.BD;
import com.envesttest.test.metier.Post;
import com.envesttest.test.metier.Topic;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class PostControler {
    BD bd = new BD();
    @RequestMapping(value="/Topic/{idT}/Post", method = RequestMethod.POST)
    public void createPost(@PathVariable("idT") int idT, @RequestBody Post post){
        bd.createNewPost(idT,post);
    }

    @RequestMapping(value="/Topic/{idT}/Post", method = RequestMethod.GET)
    public HashMap<Integer,Post> getPost(@PathVariable("idT") int idT){
        return bd.getAllPost(idT);
    }

    @RequestMapping(value="/Topic/{idT}/Post/CherchePost", method = RequestMethod.GET)
    public Post cherchePost(@RequestParam(value="titreP", required = true) String titreP){
        return bd.cherchePost(titreP);
    }

    @RequestMapping(value = "/Topic/{idT}/Post/{idP}", method = RequestMethod.PUT)
    public void updateTopic(@PathVariable("idT") int idt, @PathVariable("idP") int idp, @RequestBody Post post, @RequestParam(value="corpsChange", required = true) String corpsChange){
        bd.updatePost(idt, idp, corpsChange);
    }

    @RequestMapping(value = "Topic/{idT}/Post/{idP}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable("idT") int idt, @PathVariable("idP") int idp){
        bd.deletePost(idt, idp);
    }
}
