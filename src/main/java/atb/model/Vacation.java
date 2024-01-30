package main.java.atb.model;

public abstract class Vacation {
    private String vacationName;
    private String responsibilities;
    private String workQualityLevel;
    private int salary;
    private int durationOfHoliday;
    private String workerName;
    private String bonusOnTheNumberOfSales;

    public Seller.BonusOnTheNumberOfSales getBonusOnTheNumberOfSales() {
        return bonusOnTheNumberOfSales;
    }

    public void setBonusOnTheNumberOfSales(String bonusOnTheNumberOfSales) {
        this.bonusOnTheNumberOfSales = bonusOnTheNumberOfSales;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public void setVacationName(String vacationName) {
        this.vacationName = vacationName;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public void setWorkQualityLevel(String workQualityLevel) {
        this.workQualityLevel = workQualityLevel;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDurationOfHoliday(int durationOfHoliday) {
        this.durationOfHoliday = durationOfHoliday;
    }

    public String getVacationName() {
        return vacationName;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public String getWorkQualityLevel() {
        return workQualityLevel;
    }

    public int getSalary() {
        return salary;
    }

    public int getDurationOfHoliday() {
        return durationOfHoliday;
    }
}
