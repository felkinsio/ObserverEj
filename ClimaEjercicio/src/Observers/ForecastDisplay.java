package Observers;

public class ForecastDisplay implements Observer, Display{
    public double temperatura;
    public double humedad;
    public double presion;
    
    public void display(){
            
    }

    public void actualizarEstado(double temperatura, double humedad, double presion){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }
}
