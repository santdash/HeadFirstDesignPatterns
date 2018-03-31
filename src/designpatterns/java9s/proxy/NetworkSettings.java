package designpatterns.java9s.proxy;

public final class NetworkSettings {

    public static ISP getInternet() {
        return new InternetProxy();
    }

    public static ISP getISP(){
        return new VodaFone();
    }
}
