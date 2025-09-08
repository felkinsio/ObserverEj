package Subjects;

import java.util.Observer;

interface Subject {
    public void notificarObserver();
    public void quitarObserver(Observer observer);
    public void agregarObserver(Observer observer);
}
