package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
             BufferedReader reader1 = new BufferedReader(new FileReader("text1.txt"))) {

            writeNewFile(fileScan(reader), fileScan(reader1));

        } catch (IOException e) {
            System.out.println("ERROR!!");
        }

    }

    private static String[] fileScan(BufferedReader reader) {

        StringBuilder sB = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                sB.append(line);
            }
        } catch (IOException e) {
            System.out.println("ERROR!!");
        }

        return sB.toString().split("[, .]");

    }

    private static void writeNewFile(String[] a, String[] b) {

        try (PrintWriter newFile = new PrintWriter("newTxt.txt")) {
            newFile.println(check(a, b));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR!!");
        }

    }

    private static String check(String[] a, String[] b) {

        StringBuilder out = new StringBuilder();

        for (String file : a) {
            for (String file2 : b) {
                if (file.equals(file2)) {
                    out.append(file).append(" ");
                    break;
                }
            }
        }
        return String.valueOf(out);
    }

}
