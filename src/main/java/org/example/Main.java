package org.example;

public class Main {
    public static void main(String[] args) {
  Application.DataBase dataBase = new Application.DataBase();
        dataBase.connect();
        dataBase.disconnect();
    }
}