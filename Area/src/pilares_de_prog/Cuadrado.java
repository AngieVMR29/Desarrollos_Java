package pilares_de_prog;

public class Cuadrado extends Figura{

private float lado;


public Cuadrado() {
}
    public Cuadrado(float lado) {
    this.lado = lado;
}
public void CalcularArea() {
    float area = lado*lado;
    System.out.println("El área del cuadrado es: lado "+lado+" y su area "+area);
       
    }
public float getLado() {
      return lado;
    }
public void setLado(float lado) {
        this.lado = lado;
    }
   

    
}
