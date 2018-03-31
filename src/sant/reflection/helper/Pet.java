package sant.reflection.helper;

public class Pet extends Animal {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
