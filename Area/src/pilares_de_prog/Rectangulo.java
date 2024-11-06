package pilares_de_prog;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo() {
    }
        public Rectangulo(double base,double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    public double getBase() {
            return base;
        }
        public void setBase(double base) {
            this.base = base;
        }
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }
    
        public void CalcularArea() {
        double area = base*altura;
        System.out.println("El área del rectangulo es: base "+base+" por su altura "+altura+" es igual a "+area);
           
        }

    
}
