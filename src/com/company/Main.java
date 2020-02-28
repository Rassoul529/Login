package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your name");
        String Username = input.nextLine();
        System.out.println(" Enter your   password");
        String Password = input.nextLine();
        MyMethod(Username, Password);

    }

    public static void MyMethod(String x, String y) {

        Scanner input = new Scanner(System.in);

        String RightUserName = "neo";
        String RightPassword = "followthewhiterabbit";

        while (!x.equals(RightUserName) && !RightPassword.equals(y)) {
            System.out.println("Invalid username or password");
            System.out.println(" Enter username");
            x = input.nextLine();

            System.out.println(" Enter password");
            y = input.nextLine();
        } //  WelcomeNeo(Username, Password);


        System.out.println(" Welcome neo");
    }
}
//  public static String WelcomeNeo(String x, String y){