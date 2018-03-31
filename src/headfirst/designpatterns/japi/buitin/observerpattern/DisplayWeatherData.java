package headfirst.designpatterns.japi.buitin.observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dashsan on 3/14/2017.
 */
public class DisplayWeatherData implements Observer {

    Observable observable;

    public DisplayWeatherData(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if ( o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            System.out.println(weatherData.getTemperature()+ ":" + weatherData.getHumidity() + ":" + weatherData.getPressure());
            observable.deleteObserver(this);
        }
    }
}
