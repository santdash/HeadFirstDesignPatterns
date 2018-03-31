package san.check;

import java.util.ArrayList;
import java.util.List;

public class FinalArrayList {
    private final List<String> polled = new ArrayList<>();
    private final List<String> notPolled = new ArrayList<>();
    private final List<String> notMatched = new ArrayList<>();

    public List<String> getPolled() {
        return polled;
    }

    public List<String> getNotPolled() {
        return notPolled;
    }

    public List<String> getNotMatched() {
        return notMatched;
    }

    public void print(){
        System.out.println("Size of Polled: " + polled.size());
        System.out.println("Size of not polled: " + notPolled.size());
        System.out.println("Size of notMatched: " + notMatched.size());
    }

    public static void main(String[] args) {
        FinalArrayList fal = new FinalArrayList();
        fal.getPolled().add("Polled1");
        fal.getPolled().add("Polled2");

        fal.getNotPolled().add("NotPolled1");
        fal.getNotPolled().add("NotPolled2");

        fal.getNotMatched().add("NotMatched1");

        fal.print();

        fal.getNotPolled().addAll(fal.getPolled());
        fal.getPolled().clear();
        fal.print();


    }
}
