package com.gordeev.jman;

import java.io.*;

public class CopyOfFile implements Runnable {

    private File file;
    private File copyFile;
    private int progress;

    public CopyOfFile(File file, File copyFile, int progress) {
        this.file = file;
        this.copyFile = copyFile;
        this.progress = progress;
    }

    public CopyOfFile() {
    }

    @Override
    public void run() {

        copy(file, copyFile, progress);

    }

    public void copy(File a, File b, int progress) {

        Thread thread = Thread.currentThread();

        try (FileInputStream fis = new FileInputStream(a);
             FileOutputStream fos = new FileOutputStream(b)) {

            byte[] temp = new byte[progress];
            int flag = 0;


            for (; (flag = fis.read(temp)) > 0; ) {

                fos.write(temp, 0, flag);
                progress += flag;
                System.out.println("progress " + progress + " of " + fis.available() + " Thread " + thread.getName());

            }


        } catch (FileNotFoundException e) {
            System.out.println("Error!! File not found");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public File getCopyFile() {
        return copyFile;
    }

    public void setCopyFile(File copyFile) {
        this.copyFile = copyFile;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }


}
