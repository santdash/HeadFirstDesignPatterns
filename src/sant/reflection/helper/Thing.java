package sant.reflection.helper;

public abstract class Thing {
    private String name;
    private int counter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public abstract void abstractMethod(int a, int b);
}
