package generics.intermediate.Question4;

public class NotificationService {
    public <T> void send(T message) {
        System.out.println("Sending " + message);
    }
}
