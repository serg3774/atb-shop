package main.java.atb.component;

import main.java.atb.model.Vacation;
import main.java.atb.model.Worker;
import main.java.atb.service.VacationService;
import main.java.atb.service.WorkerService;

public class AppRunner {
    private WorkerService workerService = new WorkerService();
     private VacationService vacationService = new VacationService();

    public void run(){
        if(Authenticator.auth()){
            Worker worker = workerService.registerNewWorker();

            if(worker != null){
                System.out.println("Add vacation for worker");

                Vacation vacation = vacationService.registerWorkerForVacation();
                worker.setVacation(vacation);
                vacation.setWorkerName(worker.getName() + " " + worker.getSurName() );
                System.out.println("Vacation has been added");
            }
        }
    }
}
