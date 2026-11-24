package JavaFeature.Version17.sealedClasses;

public sealed class Payment permits UPIpayment, BankPayment {
    void greeting(String name) {
        System.out.println("Hello " + name);
    }
}
