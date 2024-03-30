package com.crickettam.cricketteam;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Player {

    @Id 
    private Integer pid;

    private String pname;

    private String pavg;

    private int pwicket;
    
}
