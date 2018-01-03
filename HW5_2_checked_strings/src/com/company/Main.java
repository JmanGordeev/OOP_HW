package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new FileReader("text.txt"));
             Scanner sc1 = new Scanner(new FileReader("text1.txt"))) {

            String[] a = sc.nextLine().split("[, .]");
            String[] b = sc1.nextLine().split("[, .]");
            writeNewFile(a, b);

        } catch (IOException e) {
            System.out.println("ERROR!!");
        }

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

        for (String f : a) {
            for (String f1 : b) {
                if (f.equals(f1)) {
                    out.append(f).append(" ");
                    break;
                }
            }
        }
        return String.valueOf(out);
    }

}
