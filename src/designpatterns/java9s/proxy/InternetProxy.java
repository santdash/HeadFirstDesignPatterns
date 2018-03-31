package designpatterns.java9s.proxy;

public final class InternetProxy implements ISP {
    @Override
    public String getResource(String site) {

        if (isBlocked(site) ){
            return "Sorry, this site is blocked as per company policy";
        }
        return NetworkSettings.getISP().getResource(site);
    }

    private boolean isBlocked(String site){
        switch(site){
            case "www.google.com":
            case "www.yahoo.com":
                return false;
            default:
                return true;
        }
    }

}
