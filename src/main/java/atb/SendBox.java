package main.java.atb;


import main.java.atb.comporator.SellerSalaryComparator;
import main.java.atb.model.Seller;

import java.util.Arrays;
import java.util.Comparator;

public class SendBox {

    public static void main(String[] args) {
        Seller[] sellers = {
                new Seller(Seller.Big),
                new Seller(Seller.Medium),
                new Seller(Seller.Small)
        };
        Arrays.sort(sellers, new SellerSalaryComparator());
        for (Seller seller : sellers){
            System.out.println(seller.getBonusOnTheNumberOfSales());
        }
    }


}
