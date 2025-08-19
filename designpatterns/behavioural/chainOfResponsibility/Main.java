package designpatterns.behavioural.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler general = new GeneralSupport();
        SupportHandler billing = new BillingSupport();
        SupportHandler technical = new TechnicalSupport();
        SupportHandler delivery = new DeliverySupport();

        general.setNextHandler(billing);
        billing.setNextHandler(technical);
        technical.setNextHandler(delivery);

//        general.handleRequest("refund");
        general.handleRequest("delivery");
//        general.handleRequest("unknown");
    }
}
