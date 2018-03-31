package designpatterns.proxy.oapr;

public class BusinessObjectImplementaion implements BusinessObject {

    @Override
    public void sayHi(){
        System.out.println("BusinessObjectImplementaion: Saying hi to client");
    }
}
