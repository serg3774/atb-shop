package main.java.atb.service;

import main.java.atb.Main;
import main.java.atb.model.Worker;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkerService {

    private static String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static String NAME_PATTERN = "^[a-zA-Z-]{3,}$";
    private static String SURNAME_PATTERN = "^[a-zA-Z-]{3,}$";

   public  Worker registerNewWorker(){
       Worker worker = null;

        System.out.println("Please provide a worker details.");
        System.out.println("Email: ");
        String email = Main.SCANNER.nextLine();
        System.out.println("Name: ");
        String name = Main.SCANNER.nextLine();
        System.out.println("Surname: ");
        String surName = Main.SCANNER.nextLine();
        if(isEmailValid(email)&&isNameValid(name)&&isSurNameValid(surName)){
             worker = buildWorker(email,name,surName);
            System.out.println("New worker: " + worker.getName() + " "+ worker.getSurName()+" "+ " ("+worker.getEmail()+")");
        }else {
            System.out.println("Provided info is invalid");
        }
        return worker;
    }

    private static Worker buildWorker(String email, String name, String surName) {
        Worker worker = new Worker();
        worker.setEmail(email);
        worker.setName(name);
        worker.setSurName(surName);
        return worker;
    }

    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    private static boolean isSurNameValid(String surName) {
        Pattern pattern = Pattern.compile(SURNAME_PATTERN);
        Matcher matcher = pattern.matcher(surName);
        return matcher.matches();
    }

    private static boolean isNameValid(String name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
