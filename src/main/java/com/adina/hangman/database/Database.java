package com.adina.hangman.database;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import com.adina.hangman.entities.Game;
import com.adina.hangman.entities.Player;

import lombok.Getter;

@Getter
public class Database {

    private Map<String, Player> data = populateDatabase();

    private Map<String, Player> populateDatabase() {

        final String username = "Player ";

        Map<String, Player> dataToUpdate = new HashMap<>();

        IntStream.rangeClosed(1, 20).forEach(i -> {

            String usernameFinal = username + i;
            Player player = new Player(usernameFinal);
            String secretWord = usernameFinal + "Secret Word";
            String visibleWord = String.join("", Collections.nCopies(secretWord.length(), "?"));
            Game game = new Game(player, secretWord, visibleWord);
            player.setCurrentGame(game);
            dataToUpdate.put(player.getUsername(), player);
        });

        return dataToUpdate;

    };

}
