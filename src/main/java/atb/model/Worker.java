package main.java.atb.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public  class Worker {
    private static  final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private String name;
    private String surName;
    private String email;
    private List<Vacation> vacations = new ArrayList<>();
    private final LocalDateTime registrationDate = LocalDateTime.now();

    @Override
    public String toString(){
        return "Worker {"
                +"\n\tname = "+name
                + ", surname = " +surName
                + ", email = " +email
                + ",\n\tvacations = " +vacations
                + ",\n\tregistrationDate = " +registrationDate.format(FORMATTER)
                + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name) && Objects.equals(surName, worker.surName) && Objects.equals(email, worker.email) && Objects.equals(vacations, worker.vacations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, email, vacations);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return email;
    }

    public List<Vacation> getVacation() {
        return vacations;
    }

    public void setVacation(List<Vacation> vacation) {
        this.vacations = vacation;
    }

    public void addVacation(Vacation vacation){
        vacations.add(vacation);
    }
}
