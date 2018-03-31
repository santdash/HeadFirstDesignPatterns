package designpatterns.proxy.cli;

import designpatterns.proxy.oapr.BusinessObject;
import designpatterns.proxy.oapr.BusinessObjectProxy;

public class PtestClient {
    public static void main(String[] args) {
        BusinessObject bo = BusinessObjectProxy.getBusinessObject();
        bo.sayHi();
    }
}
