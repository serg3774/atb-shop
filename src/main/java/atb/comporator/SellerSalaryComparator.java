package main.java.atb.comporator;

import main.java.atb.model.Seller;

import java.util.Comparator;

public class SellerSalaryComparator implements Comparator<Seller> {
    @Override
    public int compare(Seller seller1, Seller seller2) {
        return convertSalary(seller1.getBonusOnTheNumberOfSales()) - convertSalary(seller2.getBonusOnTheNumberOfSales());
    }

    private static int convertSalary(String bonus){
        return switch (bonus){
            case Seller.Small ->1;
            case Seller.Medium ->2;
            case Seller.Big ->3;
            default -> 0;
        };
    }
}
