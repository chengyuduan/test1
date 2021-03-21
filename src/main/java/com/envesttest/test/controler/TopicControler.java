package com.envesttest.test.controler;

import com.envesttest.test.DAO.BD;
import com.envesttest.test.metier.Topic;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class TopicControler {
    BD bd = new BD();
    @RequestMapping(value="/Topic", method = RequestMethod.POST)
    public void creatTopic(@RequestBody Topic topic){
        bd.createNewTopic(topic);
    }

    @RequestMapping(value="/Topic", method = RequestMethod.GET)
    public HashMap<Integer,Topic> getTopic(){
        return bd.getAllTopic();
    }

    @RequestMapping(value="/Topic/Recherche", method = RequestMethod.GET)
    public Topic chercheTopic(@RequestParam(value="nomT", required = true) String nomT){
        return bd.chercheTopic(nomT);
    }
    @RequestMapping(value = "/Topic/{idT}", method = RequestMethod.PUT)
    public void updateTopic(@PathVariable("idT") int id, String nomT){
        bd.updateTopic(id,nomT);
    }

    @RequestMapping(value = "Topic/{idT}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable("idT") int id){
        bd.deleteTopic(id);
    }

}
