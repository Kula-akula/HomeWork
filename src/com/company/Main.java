package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    static final String FILE_NAME = "C:\\Users\\LS Cargo\\Desktop\\Git Files\\HomeWorks\\src\\com\\company\\main.java";


    public static void main(String[] args) throws IOException, IllegalStateException {
        File file = new File(FILE_NAME);

        System.out.println(getFileSizeBytes(file));
        FileWriter fw = new FileWriter("New Main.txt");
        FileWriter fw2=new FileWriter("New Main without space.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(FILE_NAME);
            Scanner sc = new Scanner(fr);
            if (!sc.hasNextLine()) {
                throw new FileNotFoundException("File not found");
            }
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                fw.write(line);
                fw.write("\n");
                fw2.write(line.replaceAll(" ",""));
                fw2.write("\n");
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            System.out.println("Caught null pointer exception");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("File not found");
        } finally {
            if (fr!=null) {
                fr.close();
            }
            fw.close();
            fw2.close();
        }
        if (!file.exists() | !file.isFile()) return;
        if (file.length()>100){
            throw new IllegalStateException("Size of code bigger than we can use");
        }

    }

    private static String getFileSizeBytes(File file) {
        return (double) file.length() + " bytes";
    }
}

