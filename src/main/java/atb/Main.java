package main.java.atb;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String PASSWORD = "12345";
    static Scanner SCANNER = new Scanner(System.in);
    static String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    static String NAME_PATTERN = "^[a-zA-Z-]{3,}$";
    static String SURNAME_PATTERN = "^[a-zA-Z-]{3,}$";

    public static void main(String[] args) {
        run();
    }
    static void run(){
       if(auth()){
           registerNewWorker();
       }
    }

    static boolean auth(){
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
        return accpept;
    }

    static void registerNewWorker(){
        System.out.println("Please provide a worker details.");
        System.out.println("Email: ");
        String email = SCANNER.nextLine();
        System.out.println("Name: ");
        String name = SCANNER.nextLine();
        System.out.println("Surname: ");
        String surName = SCANNER.nextLine();
        if(isEmailValid(email)&&isNameValid(name)&&isSurNameValid(surName)){
           Worker worker = buildWorker(email,name,surName);
            System.out.println("New worker: " + worker.name + " "+ worker.surName+" "+ " ("+worker.email+")");
        }else {
            System.out.println("Provided info is invalid");
        }
    }



    static Worker buildWorker(String email, String name, String surName) {
        Worker worker = new Worker();
        worker.email = email;
        worker.name = name;
        worker.surName = surName;
        return worker;
    }

    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    static boolean isSurNameValid(String surName) {
        Pattern pattern = Pattern.compile(SURNAME_PATTERN);
        Matcher matcher = pattern.matcher(surName);
        return matcher.matches();
    }

    static boolean isNameValid(String name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}

