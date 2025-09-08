package Observers;

public class StadisticsDisplay implements Observer,Display {   
    public double temperatura;
    public double humedad;
    public double presion;

    public void display(){
    System.out.println("Weather\n"+
                        "Stats:\n"+
                        "Avg. temp:" + temperatura + 
                        "\nMin. temp" + temperatura +
                        "\nMax. temp" + temperatura);
    }
    
    public void actualizarEstado(double temperatura, double humedad, double presion){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }
}

