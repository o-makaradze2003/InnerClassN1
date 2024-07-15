package org.example;

public class Application {
    static class DataBase{
        void connect(){
            System.out.println("Connecting to the Application...");
            System.out.println("Connected to the Database...");
        }
        void disconnect(){
            System.out.println("Disconnecting to the Application...");
            System.out.println("Disconnected from Database...");
        }
    }
}
