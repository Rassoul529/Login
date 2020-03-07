package com.company;

public class Main {

    public static void login(String username, String password){
        if(username == "neo" && password == "followthewhiterabbit"){
            System.out.println("Welcome, Neo");
        } else {
            System.out.println("Invalid username or password");
        }
    }

    public static void main(String[] args) {

        String Username = "neo";
        String Password = "followthewhiterabbit";
        login(Username, Password);

    }
}