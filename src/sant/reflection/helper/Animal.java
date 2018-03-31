package sant.reflection.helper;

public class Animal {
    private String generalName;
    private int lifeSpan;

    public Animal() {

    }

    public Animal(String generalName, int lifeSpan) {
        this.generalName = generalName;
        this.lifeSpan = lifeSpan;
    }

    public String getGeneralName() {
        return generalName;
    }

    public void setGeneralName(String generalName) {
        this.generalName = generalName;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
