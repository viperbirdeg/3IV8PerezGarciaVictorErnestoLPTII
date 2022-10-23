import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;

class Metodos4{
    public char puesto;
    public String nombreEmpleado;
    double[] sueldoQuincenal = {5000.00,8000.00};
    double sueldoEmpleado;


    ArrayList<String> idEmpleado = new ArrayList<String>();
    Scanner entrada = new Scanner(System.in);

    public void Datos(){
        idEmpleado.add(0, "123");
        System.out.println("Ingresa tu id");
        if(idEmpleado.contains(entrada.nextLine())){
            System.out.println("Elige tu puesto");
            System.out.println("a. Supervisor");
            System.out.println("b. Empleado");
            puesto = entrada.next().charAt(0);
            switch (puesto){
                case 'a':
                    PagoSupervisor();
                    break;
                
                case 'b':
                    System.out.println("El sueldo del empleado es: " + PagoEmpleado() + " peso");
                    break;
                
                default: 
                    System.out.println("Opcion invalida");
                    break;
            }
        }else{
            System.out.println("No se encuentra el id, Adios");
        }

    }

    public void PagoSupervisor(){ 
        System.out.println("No disponible");       

    }
    public double PagoEmpleado(){
        double hrExtDiurnas, hrExtNocturnas;
 
        System.out.println("Ingresa cuantas horas extras diurnas trabajaste esta quincena.");
        hrExtDiurnas = entrada.nextDouble();
        System.out.println("Ingresa cuantas horas extras nocturnas trabajaste esta quincena.");
        hrExtNocturnas = entrada.nextDouble();
        sueldoEmpleado = (sueldoQuincenal[0])+(hrExtDiurnas*50.0)+(hrExtNocturnas*60.0);
        return sueldoEmpleado;

    }
    public s
}