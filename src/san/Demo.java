package san;

public class Demo {
    int newnumber;
    int previousnumber = 1;
    int pppnumber = 0;


    public void displaySequence() {
        System.out.println(pppnumber);
        int i = 0;
        while (i < 10) {
            newnumber = pppnumber + previousnumber;
            pppnumber = previousnumber;
            previousnumber = newnumber;
            System.out.println(newnumber);
            i++;

        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.displaySequence();
    }

}