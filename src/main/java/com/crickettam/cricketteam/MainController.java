package com.crickettam.cricketteam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class MainController {
    
    @Autowired
    private iPlayer repo;

    @GetMapping("")
    public java.util.Collection<Player> viewAll(){

        return repo.findAll();

    }

    @PostMapping("")
    public String savePlayer(@RequestBody Player p){
        repo.save(p);
        return "player Saved as"+p.getPname();

    }

    

}
