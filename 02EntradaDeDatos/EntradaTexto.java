//Esto es un comentario 

/* 
 * Todo programa en java debe de tener el nombre de la clase tal cual como el archivo 
 */

class EntradaTexto {
    public static void main(String[] args) {
        // Los limites de la clase

        // Toda clase debe de tener un metodo principal
        /**
         * vamos a realizar un programa por el cual podemos introducir texto a nuestra
         * conveniencia
         */

        // tipo de dato
        String nombre;
        // el ; es el fin de linea
        int edad;

        // instancia
        System.out.println("Por favor introduce tu nombre asi bien kawaii");

        // Vamos a optener el nombre del usuario
        nombre = System.console().readLine();

        System.out.println("Por favor introduce tu edad: ");

        edad = Integer.parseInt(System.console().readLine());

        System.out.println("Hola " + nombre + "bienvenido a tu programita tienes " + edad + " años.");

    }

}