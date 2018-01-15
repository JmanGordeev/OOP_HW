package com.gordeev.jman;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("123.jpg");
        File file2 = new File("copy123.jpg");

        CopyOfFile copy = new CopyOfFile(file, file2, 1024);


        Thread thread = new Thread(copy);
        Thread thread1 = new Thread(copy);
        Thread thread2 = new Thread(copy);

        thread.start();
        thread1.start();
        thread2.start();

    }
}
