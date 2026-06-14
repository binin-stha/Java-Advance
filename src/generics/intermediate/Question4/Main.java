package generics.intermediate.Question4;

public class Main {
    static void main() {
        NotificationService service = new NotificationService();
        service.send(new EmailMessage("binin@gmail.com", "CourseWork", "Do the Assignment."));

        System.out.println();

        service.send(new PushNotification("DEV-123", "Gym", "50% off for this month."));

        System.out.println();

        service.send(new SMSMessage("9841XXXXXX", "Corona is Gone."));

    }
}
