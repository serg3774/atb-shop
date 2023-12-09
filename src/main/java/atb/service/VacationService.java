package main.java.atb.service;

import main.java.atb.Main;
import main.java.atb.model.Seller;
import main.java.atb.model.Vacation;

public class VacationService {
    private static String SELLER_TYPE = "seller";
    public Vacation registerWorkerForVacation(){
        Vacation vacation = new Vacation();
        System.out.println("Type (seller / cleaner / supervisor / administrator / other): ");
        String type = Main.SCANNER.nextLine();
        vacation.setVacationName(type);

        if(SELLER_TYPE.equals(type)){
            vacation = buildSeller();

        }else {
           vacation =  buildVacation(type);
        }
        return vacation;
    }

    private Seller buildSeller() {
        Vacation vacation = buildVacation(SELLER_TYPE);
        Seller seller = vacationToSeller(vacation);

        System.out.println("Bonus On The Number Of Sales (1.2x / 1.3x / 1.4x / 1.5x)");
        seller.setBonusOnTheNumberOfSales(Main.SCANNER.nextDouble());
        return seller;
    }

    private Seller vacationToSeller(Vacation vacation) {
        Seller seller = new Seller();
        seller.setSalary(vacation.getSalary());
        seller.setResponsibilities(vacation.getResponsibilities());
        seller.setWorkQualityLevel(vacation.getWorkQualityLevel());
        seller.setDurationOfHoliday(vacation.getDurationOfHoliday());
        return seller;
    }

    private Vacation buildVacation(String type) {
        Vacation vacation = new Vacation();
        vacation.setVacationName(type);

        System.out.println("Responsibilities");
        vacation.setResponsibilities(Main.SCANNER.nextLine());

        System.out.println("WorkQualityLevel (good/ well/ bad)");
        vacation.setWorkQualityLevel(Main.SCANNER.nextLine());

        System.out.println("Salary");
        vacation.setSalary(Main.SCANNER.nextInt());

        System.out.println("DurationOfHoliday");
        vacation.setDurationOfHoliday(Main.SCANNER.nextInt());
        return vacation;
    }
}
