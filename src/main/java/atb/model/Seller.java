package main.java.atb.model;

public class Seller extends  Vacation{

    private BonusOnTheNumberOfSales bonusOnTheNumberOfSales;

    public Seller(){}
    public Seller(BonusOnTheNumberOfSales salary){
        this.bonusOnTheNumberOfSales = salary;
    }

    public BonusOnTheNumberOfSales getBonusOnTheNumberOfSales() {
        return bonusOnTheNumberOfSales;
    }

    public void setBonusOnTheNumberOfSales(BonusOnTheNumberOfSales bonusOnTheNumberOfSales) {
        this.bonusOnTheNumberOfSales = bonusOnTheNumberOfSales;
    }

    public enum BonusOnTheNumberOfSales{
        Big(3),
        Medium(2),
        Small(1),
        UNKNOWN(0)
        ;
        private final int value;
        BonusOnTheNumberOfSales(int value){
            this.value=value;
        }

        public int getValue() {
            return value;
        }
    }
}
