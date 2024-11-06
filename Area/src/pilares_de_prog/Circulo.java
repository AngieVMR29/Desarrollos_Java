package pilares_de_prog;

public class Circulo extends Figura{

    private final double Pi= 3.1416;
    private double Radio;
    public void CalcularArea() {
        double Radio2= Math.pow(Radio, 2);
        double area= Pi*(Radio2);
        System.out.println("El área del circulo es "+Pi+" por "+Radio+" elevado a la 2 y es igual a "+area);
    }
    public Circulo() {
    }
    public Circulo(double radio) {
        Radio = radio;
    }
    public double getPi() {
        return Pi;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    
    


}
