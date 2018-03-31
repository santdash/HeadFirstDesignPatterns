package sant.reflection.helper;

public class MyThing extends Thing {
    private Long extraCounter;

    public Long getExtraCounter() {
        return extraCounter;
    }

    public void setExtraCounter(Long extraCounter) {
        this.extraCounter = extraCounter;
    }

    private Integer getRandomInteger(){
        return ((Double) Math.random()).intValue();
    }

    protected void print(){
        System.out.println("Printing something...");
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void abstractMethod(int a, int b) {
        System.out.println(a + b);
    }

    public static void staticMethod(){
        //do something
    }

    Integer myMethod(Integer a){
        return a;
    }
}
