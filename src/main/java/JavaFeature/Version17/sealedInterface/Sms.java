package JavaFeature.Version17.sealedInterface;

public final class Sms implements Notification {
    @Override
    public void send() {
        System.out.println("SMS has been sent successfully");
    }
}
