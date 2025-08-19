package designpatterns.behavioural.visitor;

public class ShippingCostVisitor implements ItemVisitor{
    @Override
    public void visit(PhysicalProduct item) {
        System.out.println("Shipping cost for " + item.name + ": " + item.weight * 10);
    }

    @Override
    public void visit(DigitalProduct item) {
        System.out.println("No shipping cost");
    }

    @Override
    public void visit(GiftCard item) {
        System.out.println("No shipping cost");
    }
}
