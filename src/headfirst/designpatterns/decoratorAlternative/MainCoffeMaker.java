package headfirst.designpatterns.decoratorAlternative;

/**
 * Created by dashsan on 3/15/2017.
 */
public class MainCoffeMaker {

    public static void main(String[] args) {
        Capuchinno capuchinno = new Capuchinno();
        CoffeeMaker coffeeMaker = new CoffeeMaker(capuchinno).addAddOn(new Cream()).addAddOn(new SkimmedMilk()).addAddOn(new Cream());
        System.out.println(coffeeMaker.getDescription());
        System.out.println(coffeeMaker.getCost());
    }
}
