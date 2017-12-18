package com.gordeev.jman;

public class Network {

    private static String[] data = new String[100];

    public static void addNumber(String number) {
        for (int i = data.length - 1; i > 0; i--) {
            if (freeCellCount(data) != 0) {
                data[i] = number;
                break;
            } else System.out.println("Net work is fool, try again later...");
        }
    }

    public static void createData() {

        String start = "0681608100";
        for (int i = 0; i < data.length - 10; i++) {
            if (i < 10) {
                data[i] = start.substring(0, 9) + i;
            } else {
                data[i] = start.substring(0, 8) + i;
            }
        }
    }

    private static int freeCellCount(String[] data) {
        int count = 0;
        for (String aData : data) {
            if (aData == null) {
                count++;
            }
        }
        return count;
    }

    public static String[] getData() {
        return data;
    }

    public static boolean searchForNumbers(String numberA) {
        boolean s = false;
        for (String aData : data) {
            if (aData != null && aData.equals(numberA)) {
                s = true;
                break;
            }
        }
        return s;
    }

    public void netInfo() {
        int l = (data.length - freeCellCount(data));
        String netBaseName = "Base_KS_12345";
        System.out.println("Network " + netBaseName + " info...\n" + l + "% of possible cells are used...");
    }
}
