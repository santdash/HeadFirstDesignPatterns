package designpatterns.java9s.proxy;

public final class VodaFone implements ISP {
    @Override
    public String getResource(String s) {
        return  getResponse(s);
    }

    private String getResponse(String s) {
        switch(s){
            case "www.google.com":
                return "GOOGLE";
            case "www.yahoo.com":
                return "YAHOO";
            case "www.gaming.com":
                return "GAMING";
            case "www.facebook.com":
                return "FACEBOOK";
            default:
                return "ERROR: Such site is not available, please check the address";
        }
    }


}
