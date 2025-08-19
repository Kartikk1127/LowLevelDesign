package designpatterns.behavioural.chainOfResponsibility;

public class GeneralSupport extends SupportHandler{
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("general")) {
            System.out.println("General Support: Handling general query");
        } else if(nextHandler!=null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
