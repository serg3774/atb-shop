package main.java.atb.component;

import main.java.atb.Main;
import main.java.atb.model.Vacation;
import main.java.atb.model.Worker;
import main.java.atb.service.VacationService;
import main.java.atb.service.WorkerService;

public class AppRunner {
    private final WorkerService workerService = new WorkerService();
     private final VacationService vacationService = new VacationService();

    public void run(){
        if(Authenticator.auth()){
            Worker worker = workerService.registerNewWorker();

            if(worker != null){
                registerVacation(worker);
                System.out.println(worker);
            }
        }
    }

    private void registerVacation(Worker worker){
        boolean continueAddVacation = true;
        while (continueAddVacation){
            addVacation(worker);

            System.out.println("Do you want to add more vacations fo the current worker?(y/n):");
            String answer = Main.SCANNER.nextLine();

            if("n".equals(answer)){
                continueAddVacation = false;
            }
            continueAddVacation = !"n".equals(answer);
            continueAddVacation = "y".equals(answer);
        }
    }

    private void addVacation(Worker worker){
        System.out.println("Add vacation for worker");

        Vacation vacation = vacationService.registerWorkerForVacation();

        if(vacation!=null){
            worker.addVacation(vacation);
            vacation.setWorkerName(worker.getName() + " " + worker.getSurName() );
            System.out.println("Vacation has been added");
        }
    }
}
