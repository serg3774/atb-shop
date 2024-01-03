package main.java.atb.service;

import main.java.atb.Main;
import main.java.atb.model.Consultant;
import main.java.atb.model.Seller;
import main.java.atb.model.Vacation;

public class VacationService {
    private static final String SELLER_TYPE = "seller";
    private static final String CONSULTANT_TYPE = "consultant";
    public Vacation registerWorkerForVacation(){
        Vacation vacation = null;
        System.out.println("Type (seller / consultant): ");
        String type = Main.SCANNER.nextLine();
        vacation.setVacationName(type);

        if(SELLER_TYPE.equals(type) || CONSULTANT_TYPE.equals(type)){
            vacation = buildVacation(type);

        }else {
            System.out.println("Unknown vacation: "+ type);
        }
        return vacation;
    }


    private Vacation buildVacation(String type) {
        Vacation vacation = type.equals(SELLER_TYPE) ? new Seller(): new Consultant();
        vacation.setVacationName(type);

        System.out.println("Responsibilities");
        vacation.setResponsibilities(Main.SCANNER.nextLine());

        System.out.println("WorkQualityLevel (good/ well/ bad)");
        vacation.setWorkQualityLevel(Main.SCANNER.nextLine());

        System.out.println("Salary");
        vacation.setSalary(Main.SCANNER.nextInt());

        System.out.println("DurationOfHoliday");
        vacation.setDurationOfHoliday(Main.SCANNER.nextInt());

        if(type.equals(SELLER_TYPE)){
            System.out.println("Bonus On The Number Of Sales (1.1x / 1.3x / 1.5x)");
            ((Seller) vacation).setBonusOnTheNumberOfSales(Main.SCANNER.nextLine());
        }
        return vacation;

    }
}
