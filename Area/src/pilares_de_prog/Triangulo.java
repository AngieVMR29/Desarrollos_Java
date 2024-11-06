package pilares_de_prog;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo() {
    }
        public Triangulo(double base,double altura) {
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
        double area =(base*altura)/2;
        System.out.println("El área del triangulo es: base "+base+" por su altura "+altura+ "divido 2 y su area es igual a "+area);
           
        }
    
}
