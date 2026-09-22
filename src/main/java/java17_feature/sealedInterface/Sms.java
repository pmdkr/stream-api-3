package java17_feature.sealedInterface;

public final class Sms implements Notification {
    @Override
    public void send() {
        System.out.println("SMS has been sent successfully");
    }
}
