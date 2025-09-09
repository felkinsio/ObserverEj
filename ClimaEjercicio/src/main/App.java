package main;

import Observers.CurrentDisplay;
import Observers.HeatDisplay;
import Subjects.WeatherData;

public class App {
    public static void main(String[] args) throws Exception {

        WeatherData weatherData = new WeatherData();
        
        HeatDisplay pantalla1 = new HeatDisplay();
        CurrentDisplay pantalla2 = new CurrentDisplay();

        weatherData.agregarObserver(pantalla1);
        weatherData.agregarObserver(pantalla2);

        weatherData.notificarObserver();

        pantalla2.display();
        System.out.println("---------------------");
        pantalla1.display();
        
    }
}
