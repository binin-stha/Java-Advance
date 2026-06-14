package generics.intermediate.Question4;

public class PushNotification {
    public String deviceId;
    public String title;
    public String content;

    public PushNotification(String deviceId, String title, String content) {
        this.deviceId = deviceId;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Push Notification...\nDevice: " + deviceId + "\nStatus: Delivered";
    }
}
