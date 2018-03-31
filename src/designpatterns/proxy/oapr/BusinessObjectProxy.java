package designpatterns.proxy.oapr;

public class BusinessObjectProxy implements BusinessObject {

    private final BusinessObject businessObject;

    private BusinessObjectProxy(BusinessObject businessObject){
        this.businessObject = businessObject;
    }

    public static synchronized BusinessObjectProxy getBusinessObject(){
        return new BusinessObjectProxy(new BusinessObjectImplementaion());
    }

    @Override
    public void sayHi() {
        System.out.println("BusinessObjectProxy: Checking security");
        this.businessObject.sayHi();
        System.out.println("BusinessObjectProxy: Exit...");
    }
}
