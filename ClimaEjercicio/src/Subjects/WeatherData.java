package Subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class WeatherData implements Subject {

    double temperatura = 20;
    double humedad = 5.7;
    double presion = 97;

    public  List<Observer> observers = new ArrayList<>();

    public void notificarObserver(){
        System.out.println("se agrego algo");
    }
    public void quitarObserver(Observer observer){
        observers.remove(observer);
    }
    public void agregarObserver(Observer observer){
        observers.add(observer);
    }
}
