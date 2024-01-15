package main.java.atb;



import main.java.atb.model.Seller;

import java.util.Arrays;
import java.util.Comparator;

public class SendBox {

    public static void main(String[] args) {
        Seller[] sellers = {
                new Seller(Seller.BonusOnTheNumberOfSales.Big),
                new Seller(Seller.BonusOnTheNumberOfSales.Medium),
                new Seller(Seller.BonusOnTheNumberOfSales.Small)
        };
        Arrays.sort(sellers, new Comparator<Seller>() {
            @Override
            public int compare(Seller o1, Seller o2) {
                return  o1.getBonusOnTheNumberOfSales().getValue() - o2.getBonusOnTheNumberOfSales().getValue();
            }
        });
        for (Seller seller : sellers){
            System.out.println(seller.getBonusOnTheNumberOfSales());
        }
    }


}
