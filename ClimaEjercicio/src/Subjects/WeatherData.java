package Subjects;

import Observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    double temperatura = 20;
    double humedad = 5.7;
    double presion = 97;

    public  List<Observer> observers = new ArrayList<>();

    public void notificarObserver(){

        for (Observer o : observers) {
        o.actualizarEstado(temperatura, humedad, presion);
    }
    }
    public void quitarObserver(Observer observer){
        observers.remove(observer);
    }
    public void agregarObserver(Observer observer){
        observers.add(observer);
    }
    public double getTemperatura() {
        return temperatura;
    }
    public double getHumedad() {
        return humedad;
    }
    public double getPresion() {
        return presion;
    }

}
