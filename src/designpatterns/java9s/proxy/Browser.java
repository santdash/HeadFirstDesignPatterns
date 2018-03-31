package designpatterns.java9s.proxy;

import javax.swing.*;

public class Browser {


    public final void sendRequest() {
        String site = JOptionPane.showInputDialog("Enter site:");
        String response = NetworkSettings.getInternet().getResource(site);
        loadResponse(response);
    }

    private void loadResponse(String response) {
        System.out.println(response);
    }

}
