package com.adina.hangman.entities;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import com.adina.hangman.constants.GameConstants;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
    
    private final int NUMBER_OF_ATTEMPTS = 5;

    private Player player;
    private String secretWord;
    private String visibleWord;
    private int attemptsLeft;
    private List<Character> availableCharacters;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private GameStatus status;

    public Game(Player player, String secretWord, String visibleWord){

        this.player = player;
        this.secretWord = secretWord;
        this.visibleWord = visibleWord;
        this.attemptsLeft = NUMBER_OF_ATTEMPTS;
        this.availableCharacters = new LinkedList<>(GameConstants.initialCharacters);
        this.startTime = LocalDateTime.now();
        this.status = GameStatus.ACTIVE;

    }

}
