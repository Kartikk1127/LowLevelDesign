package designpatterns.behavioural.visitor;

public class GiftCard implements Item{
    String code;
    double amount;

    public GiftCard(String code, double amount) {
        this.code = code;
        this.amount = amount;
    }
    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}
