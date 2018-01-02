package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        MyFileFilter mff = new MyFileFilter("doc");

        File folder = new File("Folder1");
        File folder2 = new File("Folder2");
        File[] fl = folder.listFiles(mff);

        for (File file : fl != null ? fl : new File[0]) {
            copyFiles(file, folder2);
        }

    }

    private static void copyFiles(File file, File folder) {

        try (FileInputStream ist = new FileInputStream(file);
             FileOutputStream nIst = new FileOutputStream(folder.getName() + "/" + file.getName())) {

            byte[] buffer = new byte[1024];
            int byteread = 0;

            for (; (byteread = ist.read(buffer)) > 0; ) {
                nIst.write(buffer, 0, byteread);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class MyFileFilter implements FileFilter {

    private String arr;


    public MyFileFilter(String arr) {
        this.arr = arr;
    }

    private boolean check(String ext) {

        return ext.equals(arr);

    }

    @Override
    public boolean accept(File file) {

        int pointerIndex = file.getName().indexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = file.getName().substring(pointerIndex + 1);
        return check(ext);

    }

}


