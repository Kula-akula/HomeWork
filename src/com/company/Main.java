package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader firstTask = new FileReader("Song.txt");
        Song nobodyIsHome=new Song();
        Scanner sc=new Scanner(firstTask);
        if (sc.hasNextLine()) {
            nobodyIsHome.setName(sc.nextLine());
            nobodyIsHome.setArtist(sc.nextLine());
            nobodyIsHome.setGenre(sc.nextLine());
            String text="";
            while (sc.hasNextLine()) {
                text += sc.nextLine();
                text+="\n";
            }
            nobodyIsHome.setText(text);
        }
        firstTask.close();

        FileWriter secondTask = new FileWriter("Nobody's home.txt");
        Song newNobodyIsHome=new Song();
        newNobodyIsHome.setName("Nobody's home");
        newNobodyIsHome.setArtist("Avril Lavigne");
        newNobodyIsHome.setGenre("Alternative Rock");
        newNobodyIsHome.setText("\nI couldn't tell you\n" +
                "why she felt that way,\n" +
                "She felt it everyday.\n" +
                "And I couldn't help her,\n" +
                "I just watched\n" +
                "her make the same mistakes again.\n" +
                "\n" +
                "What's wrong, what's wrong now?\n" +
                "Too many, too many problems.\n" +
                "Don't know where she belongs, where she belongs.\n" +
                "\n" +
                "She wants to go home, but nobody's home.\n" +
                "It's where she lies,\n" +
                "broken inside.\n" +
                "With no place to go, no place to go\n" +
                "to dry her eyes.\n" +
                "Broken inside.\n" +
                "\n" +
                "Open your eyes and look outside,\n" +
                "find the reasons why.\n" +
                "You've been rejected,\n" +
                "and now you can't find\n" +
                "what you left behind.\n" +
                "\n" +
                "Be strong, be strong now.\n" +
                "Too many, too many problems.\n" +
                "Don't know where she belongs, where she belongs.\n" +
                "\n" +
                "She wants to go home, but nobody's home.\n" +
                "It's where she lies,\n" +
                "broken inside.\n" +
                "With no place to go, no place to go\n" +
                "to dry her eyes.\n" +
                "Broken inside.\n" +
                "\n" +
                "Her feelings she hides.\n" +
                "Her dreams she can't find.\n" +
                "She's losing her mind.\n" +
                "She's fallen behind.\n" +
                "She can't find her place.\n" +
                "She's losing her faith.\n" +
                "She's fallen from grace.\n" +
                "She's all over the place.\n" +
                "\n" +
                "She wants to go home, but nobody's home.\n" +
                "It's where she lies,\n" +
                "broken inside.\n" +
                "With no place to go, no place to go\n" +
                "to dry her eyes.\n" +
                "Broken inside.\n" +
                "\n" +
                "She's lost inside, lost inside\n" +
                "She's lost inside, lost inside\n" +
                "\n");
        secondTask.write(newNobodyIsHome.getName());
        secondTask.write("\n");
        secondTask.write(newNobodyIsHome.getArtist());
        secondTask.write("\n");
        secondTask.write(newNobodyIsHome.getGenre());
        secondTask.write("\n");
        secondTask.write(newNobodyIsHome.getText());
        secondTask.close();

        System.out.println(nobodyIsHome);

    }
}
