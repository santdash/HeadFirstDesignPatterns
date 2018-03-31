package headfirst.designpatterns.japi.buitin.observerpattern;

/**
 * Created by dashsan on 3/14/2017.
 */
public class WMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayWeatherData data = new DisplayWeatherData(weatherData);
        weatherData.setMeasurements(4, 5, 9);
    }
}
