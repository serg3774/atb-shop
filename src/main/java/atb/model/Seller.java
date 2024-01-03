package main.java.atb.model;

public class Seller extends  Vacation{
    public static final String Big = "1.5x";
    public static final String Medium = "1.3x ";
    public static final String Small = " 1.1x";


    private String bonusOnTheNumberOfSales;

    public Seller(){}
    public Seller(String salary){
        this.bonusOnTheNumberOfSales = salary;
    }

    public String getBonusOnTheNumberOfSales() {
        return bonusOnTheNumberOfSales;
    }

    public void setBonusOnTheNumberOfSales(String bonusOnTheNumberOfSales) {
        this.bonusOnTheNumberOfSales = bonusOnTheNumberOfSales;
    }
}
