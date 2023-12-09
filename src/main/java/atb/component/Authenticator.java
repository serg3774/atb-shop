package main.java.atb.component;

import main.java.atb.Main;

public class Authenticator {
    private static String PASSWORD = "12345";
    public static boolean auth(){
        boolean accept = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("Password: ");
            String input = Main.SCANNER.nextLine();
            if(PASSWORD.equals(input)){
                accept = true;
                break;
            } else {
                System.out.println("Access denied. Please check your password");
            }
        }

        System.out.println(accept? "Welcome to ATB shop app.": "App  has been blocked.");
        return accept;
    }
}
