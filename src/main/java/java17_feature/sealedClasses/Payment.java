package java17_feature.sealedClasses;

public sealed class Payment permits UPIpayment, BankPayment {
    void greeting(String name) {
        System.out.println("Hello " + name);
    }
}
