package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        Network myNet = new Network();
        Network.createData();

        Phone myPhone = new Phone("0681608161","RedMiNote2");
        myPhone.regOnNetwork();
        myNet.netInfo();
        myPhone.phoneGetInfo();
        myPhone.call("0681608112");
    }
}
