package designpatterns.behavioural.state;

public class CancelledState implements OrderState{
    @Override
    public void next(OrderContext context) {
        System.out.println("Cancelled order cannot move to the next state");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order has been cancelled");
    }

    @Override
    public String getStateName() {
        return "CANCELLED";
    }
}
