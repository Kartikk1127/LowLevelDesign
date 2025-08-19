package designpatterns.behavioural.chainOfResponsibility;

public class BillingSupport extends SupportHandler{
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("refund")) {
            System.out.println("Billing Support: Handling refund query");
        } else if(nextHandler!=null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
