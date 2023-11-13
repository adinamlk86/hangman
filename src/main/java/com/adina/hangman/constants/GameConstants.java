package com.adina.hangman.constants;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameConstants {

    public final static List<Character> initialCharacters = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
    public final static List<String> words = getWords();

    private static List<String> getWords() {

        List<String> words = new ArrayList<>();

        try{

            Scanner scanner = new Scanner(new File("C:\\Users\\Adina\\Desktop\\hangman\\words_alpha.txt"));
            while (scanner.hasNext()) {
                words.add(scanner.nextLine().toUpperCase());
            }

        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
        return words;

    }

}