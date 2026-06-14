package generics.intermediate.Question4;

public class SMSMessage {
    public String phoneNumber;
    public String content;

    public SMSMessage(String phoneNumber, String content) {
        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    @Override
    public String toString() {
        return "SMS...\nTo: " + phoneNumber + "\nStatus: Delivered";
    }
}
