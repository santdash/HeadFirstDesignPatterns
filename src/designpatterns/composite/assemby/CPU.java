package designpatterns.composite.assemby;

public class CPU implements AssembleItem {
    private int price;
    private String name;

    public CPU(int i, String name) {
        this.price = i;
        this.name = name;
    }

    @Override
    public int getPrice() {
        System.out.println(getName());
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
