package designpatterns.behavioural.visitor;

public class DigitalProduct implements Item{
    String name;
    int downloadSizeMb;

    public DigitalProduct(String name, int downloadSizeMb) {
        this.name = name;
        this.downloadSizeMb = downloadSizeMb;
    }
    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}
