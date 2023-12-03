package main.java.atb;

import java.util.Scanner;

public class Main {
    static String PASSWORD = "12345";
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }
    static void run(){
        boolean accpept = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("Password: ");
            String input = SCANNER.nextLine();
            if(PASSWORD.equals(input)){
                accpept = true;
                break;
            } else {
                System.out.println("Access denied. Please check your password");
            }
        }

        System.out.println(accpept? "Welcome to ATB shop app.": "App  has been blocked.");
    }
}