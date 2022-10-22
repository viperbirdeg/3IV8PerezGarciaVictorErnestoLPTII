
import java.util.Scanner;

class Ejercicio {

    /*
     * Vamos a hacer un programa mediante el cual vamos a tener 4 opciones que son
     * 1.- Otra calculadora
     * 2.- Conversion de unidades
     * 3.- Creacion de un cuadrito magico
     * 4.- Movimiento
     */

    // objetos

    Scanner entrada = new Scanner(System.in);

    // metodos o compirtamientos de la clase
    // vamos a crear un metodo para el menu

    /*
     * public es el acceso a el tipo de dato, clase o metodo cualquier elemento del
     * programa puede acceder a el.
     * private es de acceso restringido, solo mediante reglas se puede acceder a el.
     * protected se puede tener acceso solo desde la misma clase y aplicando la
     * herencia de POO entre los hijos y padres
     */
    // la variable puede ser global
    char ope;

    public void menu(/* Aqui van los parametros */) {
        System.out.println("Bienvenido a los metodos");
        System.out.println("Elije una de las siguientes opciones");
        System.out.println("a. Calculadora");
        System.out.println("b. Conversion de unidades");
        System.out.println("c. Creacion de cuadros");
        System.out.println("d. Movimiendo de un cuadro");
        ope = entrada.next().charAt(0);

        switch (ope) {
            case 'a':
                // vamos a hacer un metodo
                Ejercicio1();
                break;

            case 'b':
                // vamos a hacer un metodo
                Ejercicio2();
                break;

            case 'c':
                // vamos a hacer un metodo
                Ejercicio3();
                break;

            case 'd':
                // vamos a hacer un metodo
                Ejercicio4();
                break;

            default:
                System.out.println("Gracias por estar aqui, pero hay que mimir n_n/ opcion no valida");
        }

    }

    // metodo1
    public void Ejercicio1() {

    }

    // metodo2
    public void Ejercicio2() {
        /*
         * realizar aconversion de
         * metros a cm y pulgadas
         * kg a libras y gramos
         * m/s a Km/h
         * 
         */
        double metros = 0.00, kg = 0.00, vel = 0.00, cm = 100.00, pulgadas = 39.37, gramos = 1000.00, libra = 2.20,
                ms = 0.00;

        double a, b;

        System.out.println("Seleccione la cantidad que desee convertir: ");
        System.out.println("a. Metros a cm y pulgadas");
        System.out.println("b. Kg a libras y gramos ");
        System.out.println("c. m/s a Km/h ");

        ope = entrada.next().charAt(0);
        switch (ope) {
            case 'a':
                System.out.println("Ingrese la cantidad en metros");
                metros = entrada.nextDouble();
                a = metros * cm;
                b = metros * pulgadas;
                System.out.println("La cantidad de metros son: " + metros + " en cm son: " + a + " en pulgadas son : "
                        + b);
                break;

            case 'b':
                System.out.println("Ingrese la cantidad en kilogramos");
                kg = entrada.nextDouble();
                a = kg * gramos;
                b = kg * libra;
                System.out.println("La cantidad de kg son: " + kg + " en gramos son: " + a + " en libras son : "
                        + b);
                break;

            case 'c':
                System.out.println("Ingrese la cantidad de m/s");
                ms = entrada.nextDouble();
                a = ms * (3600 / 1000);
                System.out.println("La conversion de m/s a km/h es : " + a);
                break;

            default:
                System.out.println("Opcion no valida ayos");
                break;
        }

    }

    // metodo3
    public void Ejercicio3() {
        /* cuadrado de maximo 1000 de lado */

    }

    // metodo4
    public void Ejercicio4() {
        /*
         * cuadrado que imprima asterisco y lineas de maximo 100
         * *****
         * /////
         * *****
         * /////
         * *****
         */
    }
}
