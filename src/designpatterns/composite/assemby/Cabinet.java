package designpatterns.composite.assemby;

public class Cabinet extends MultiHolder {
    private int price;
    private String cabName;
    public Cabinet(int i, String cabName) {
        this.price = i;
        this.cabName = cabName;
    }

    @Override
    public String getName() {
        return cabName;
    }

    @Override
    public int getPrice() {
        return price + super.getPrice();
    }

    public void say(){
        System.out.println("Saying Cabinet");
    }
}
