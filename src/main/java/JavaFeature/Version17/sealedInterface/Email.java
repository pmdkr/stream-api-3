package JavaFeature.Version17.sealedInterface;

public final class Email implements Notification {
    @Override
    public void send() {
        System.out.println("Email has been sent successfully");
    }
}
