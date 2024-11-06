package Reto4;

public class Reto4prueba {
    public static void main(String[] args) {
        
        Reto4empleado Empleado1= new Reto4empleado("cc", 12345, "Cristian", "Sierra", 70, 172, 24, "masculino", 30000, 8, "desarrollador", "informatica");

        Empleado1.calcularHonorarios();

        System.out.println("El empleado "+Empleado1.getNombre()+ " "+Empleado1.getApellido()+ " identificado con "+Empleado1.getTipoDocumento()+ " "+Empleado1.getDocumento()+" tiene el cargo de "+ Empleado1.getCargo()+ ", las horas laboradas son " +Empleado1.getHorastrabajadas()+", el valor por cada hora es "+Empleado1.getValorhora()+ " y su pago total, por el día laborado es " +Empleado1.calcularHonorarios());
    }
    
}
