package JavaFeature.Version17.sealedInterface;

public sealed interface Notification permits Email, Payment, Sms {
    void send();
}
