package java17_feature.sealedInterface;

public sealed interface Notification permits Email, Payment, Sms {
    void send();
}
