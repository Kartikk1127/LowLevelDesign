package designpatterns.behavioural.chainOfResponsibility;

public class DeliverySupport extends SupportHandler{
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("delivery")) {
            System.out.println("Delivery Support: Handling deliver query");
        } else if(nextHandler!=null) {
            nextHandler.handleRequest(requestType);
        } else {
            System.out.println("DeliverSupport: No handler found for request");
        }
    }
}
