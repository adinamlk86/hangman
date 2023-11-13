package com.adina.hangman.entities;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player extends User {
    
    private List<Game> games;
    private Game currentGame;

    public Player(String username) {
        super(username);
        this.games = new LinkedList<>();
       
    }
    
    
}
