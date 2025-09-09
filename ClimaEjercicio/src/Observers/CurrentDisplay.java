package Observers;

public class CurrentDisplay implements Observer, Display{
    public double temperatura;
    public double humedad;
    public double presion;
    
    public void display(){
        System.out.println("Current Conditions\n"+
                        "Temperatura:" + temperatura + 
                        "\nHumedad: " + humedad + 
                        "\nPresion: " + presion);
    }
    
    public void actualizarEstado(double temperatura, double humedad, double presion){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }
}
