package Observers;

public class HeatDisplay implements Observer, Display{
    public double temperatura;
    public double humedad;
    public double presion;
    
    public void display(){
        System.out.println("Stats:\n"+
                        "Ind. Heat:"  + calcularHeatIndex(temperatura, humedad) +
                        "\nTemp. Amb" + temperatura +
                        "\nHumedad. relativa" + humedad);
    }
    

    public void actualizarEstado(double temperatura, double humedad, double presion){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }

      private double calcularHeatIndex(double temperatura, double humedad) {
        final double c1 = -8.78469475556;
        final double c2 =  1.61139411;
        final double c3 =  2.33854883889;
        final double c4 = -0.14611605;
        final double c5 = -0.012308094;
        final double c6 = -0.0164248277778;
        final double c7 =  0.002211732;
        final double c8 =  0.00072546;
        final double c9 = -0.000003582;

        double T2 = temperatura * temperatura;
        double R2 = humedad * humedad;

        return c1
             + c2*temperatura
             + c3*humedad
             + c4*temperatura*humedad
             + c5*T2
             + c6*R2
             + c7*T2*humedad
             + c8*temperatura*R2
             + c9*T2*R2;
    }
}
