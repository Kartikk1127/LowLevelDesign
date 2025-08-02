package designpatterns.creational.abstractFactory;

public class IndiaFactory implements RegionFactory{
    @Override
    public PaymentGateway createPaymentGateway(String gatewayType) {
        return switch (gatewayType.toLowerCase()) {
            case "razorpay" -> new Razorpay();
            case "payu" -> new Payu();
            default -> throw new IllegalArgumentException("Unsupported payment gateway in India: " + gatewayType);
        };
    }

    @Override
    public Invoice createInvoice() {
        return new GSTInvoice();
    }
}
