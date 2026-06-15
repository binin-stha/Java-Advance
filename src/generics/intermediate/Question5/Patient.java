package generics.intermediate.Question5;

public class Patient {
    private int patientId;
    private String patientName;
    private int age;

    public Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient Queue\n" + patientName +"\n";
    }
}
