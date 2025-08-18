package designpatterns.behavioural.state;

public class OrderPlacedState implements OrderState{
    @Override
    public void next(OrderContext context) {
        context.setState(new PreparingState());
        System.out.println("Order is now being prepared");
    }

    @Override
    public void cancel(OrderContext context) {
        context.setState(new CancelledState());
        System.out.println("Order has been cancelled");
    }

    @Override
    public String getStateName() {
        return "ORDER PLACED";
    }
}
