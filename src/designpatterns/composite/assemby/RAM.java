package designpatterns.composite.assemby;

public class RAM implements AssembleItem {
    private String name = "RAM";
    private int price;
    public RAM(int price, String name) {
        this.price = price;
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
