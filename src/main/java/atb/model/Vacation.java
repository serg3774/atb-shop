package main.java.atb.model;

public class Vacation {
    private String vacationName;
    private String responsibilities;
    private String workQualityLevel;
    private int salary;
    private int durationOfHoliday;
    private String workerName;

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
