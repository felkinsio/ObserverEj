package Observers;

public class HeatDisplay implements Observer, Display{
    public double temperatura;
    public double humedad;
    public double presion;
    
    public void display(){
        System.out.println("Weather\n"+
                        "Stats:\n"+
                        "Ind. Heat:"  + 
                        "\nTemp. Amb" + 
                        "\nHumedad. relativa");
    }
    

    public void actualizarEstado(double temperatura, double humedad, double presion){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }
}
