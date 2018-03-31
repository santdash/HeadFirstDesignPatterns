package san.doubt.abstractc;

/**
 * Created by dashsan on 3/27/2017.
 */
public class FinalExtendedClass extends AbstractExtension {
    @Override
    public void getDef() {
        System.out.println("Getting definition from FinalExtended class");
        super.getDef();
    }
}
