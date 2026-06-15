package generics.intermediate.Question5;

public class Main {
    static void main() {
        QueueManager<Patient> patientQueueManager = new QueueManager<>("Patient");

        patientQueueManager.enqueue(new Patient(1,"Ram Sharma", 17));
        patientQueueManager.enqueue(new Patient(2,"Sita Khanal", 17));
        patientQueueManager.enqueue(new Patient(3,"Hari Gupta", 17));

        patientQueueManager.displayQueue();

        QueueManager<Doctor> doctorQueueManager = new QueueManager<>("Doctor");

        doctorQueueManager.enqueue(new Doctor());
    }
}
