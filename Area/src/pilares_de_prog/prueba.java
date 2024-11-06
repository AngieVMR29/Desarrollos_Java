package pilares_de_prog;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String Continuar="Si";
        int Opciones;
        while (Continuar.equalsIgnoreCase("SI")) {
        
            System.out.println(" Ingrese 1. Calcular area del cuadrado\n 2.Calcular area del circulo \n 3. Calcular area del rectangulo\n 4. Calcular area del triangulo"); 
            Opciones = leer.nextInt();

            switch (Opciones) {
                case 1:
                float lado;
                Cuadrado Cuadrado1= new Cuadrado();
                System.out.println("Ingrese valor para el lado del cuadrado ");
                lado= leer.nextFloat();
                Cuadrado1.setLado(lado);
                Cuadrado1.CalcularArea();
                System.out.println("¿Desea continuar?");
                Continuar= leer.next();
                    
                    break;
                case 2:
                double Radio;
                System.out.println("Ingrese radio del circulo ");
                Radio= leer.nextDouble();
                Circulo Circulo1= new Circulo();
                Circulo1.setRadio(Radio);
                Circulo1.CalcularArea();
                System.out.println("¿Desea continuar?");
                Continuar= leer.next();
                    
                    break;
                case 3:
                double base, altura;
                System.out.println("Ingrese la base del rectangulo ");
                base=leer.nextDouble();
                System.out.println("Ingrese la altura del rectangulo ");
                altura=leer.nextDouble();
                Rectangulo Rectangulo1=new Rectangulo();
                Rectangulo1.setAltura(altura);
                Rectangulo1.setBase(base); 
                Rectangulo1.CalcularArea();
                System.out.println("¿Desea continuar?");
                Continuar= leer.next();
                    
                    break;
                case 4:
                double baset, alturat;
                System.out.println("Ingrese la base del triangulo ");
                baset=leer.nextDouble();
                System.out.println("Ingrese la altura del triangulo ");
                alturat=leer.nextDouble();
                Triangulo Triangulo1= new Triangulo();
                Triangulo1.setAltura(alturat);
                Triangulo1.setBase(baset);
                Triangulo1.CalcularArea(); 
                System.out.println("¿Desea continuar calculando?");
                Continuar= leer.next();  
                    break;  
            }
        
        }
        
        



       


        

        

        
        leer.close();
    }

}
