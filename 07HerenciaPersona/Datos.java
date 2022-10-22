import javax.swing.JOptionPane;

public class Datos {
    
    //Necesitamos poder almacenar una lista de estudiantes
    Estudiante obj[] = new Estudiante[5]; 
    int x = 0;

    //menu
    void menu(){
        /*crear opciones
         * 1.- Registrar nuevo estudiante
         * 2.- Mostrar lista de estudiante
         */
        String var = "si";
        while(var.equalsIgnoreCase("si")){
            /*Cuando se solicite una entrada de informacion debemos ocupar de JoptionPane el metodo de showInputDialog pero debemos entender que todas las entrada de una interdaz son de tipo cadena*/

            int op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido \n "+ "Ingresa la opcion deseada : \n" + "1. Registrar nuevo estudiante. \n" + "2. Mostrar la lista de estudiantes."));

            switch(op){
                case 1: 
                    pedirEstudiante();
                    break;
                case 2:
                    mostrarEstudiante();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        var = JOptionPane.showInputDialog(null, "¿Desea ingresar un nuevo estudiante?");
        }
    }

    public void pedirEstudiante(){
        /*Debemos declarar los datos que necesitamos del estudiante*/
        String nom = JOptionPane.showInputDialog("Ingresa el nombre del estudiante");    
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante"));    
        char genero = JOptionPane.showInputDialog("Ingresa el genero del estudiante F/M").charAt(0);    
        int numBoleta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de boleta del estudiante"));    

        //debo de ocupar mi arreglo de objetos
        obj[x] = new Estudiante(numBoleta, nom, edad, genero);
        x++;
    }

    public void mostrarEstudiante(){
        for(int i = 0; i < x; i++){
            JOptionPane.showMessageDialog(null, "La boleta del estudiantes es:" + obj[i].getNumBoleta() + "\n" + "El nombre del estudiantes es: " + obj[i].getNombre() + "\n" + "La edad del estudiantes es: " + obj[i].getEdad() + "\n" + "El genero del estudiantes es: " + obj[i].getGenero() + "\n");
        }
    }
}
