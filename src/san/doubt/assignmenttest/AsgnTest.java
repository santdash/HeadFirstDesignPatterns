package san.doubt.assignmenttest;

public class AsgnTest {
    public static void main(String[] args) {
        XObj xObj = new XObj("Santosh", "Description");
        SObj sObj = new SObj();

        sObj.setxObj(xObj);
        System.out.println(sObj.getxObj().getName() + sObj.getxObj().getValue());
        xObj.setName("Santosh Dash");
        xObj.setValue("ChangedValue");

        System.out.println(sObj.getxObj().getName() + sObj.getxObj().getValue());

        XObj copy = xObj;
        copy.setName("NewName");
        copy.setValue("NewCV");

        System.out.println(sObj.getxObj().getName() + sObj.getxObj().getValue());

    }
}
