
/*
 * Vamos a crear un programa que se encargue de realizar las siguientes operaciomes
 * 
 * 1 - Bono o descuento por la edad 
 * 2 - Convertir numeros decimales a binario 
 * 3 - Convertir temperaturas celcius, kelvine y rankine
 * 4 - numeros positivos y negativos segun la lista de numeros
 * 5 - Tienda peke 
 * 6 - Area y perimetro de figuras 
 * 7 - Tabla 
 * 8 - Factorial
 * 9 - Dibujito 
 * 10 - Figuras huecas
 * 11 - Patrones 
 * 12 - Diamante (No llegan en lol)
 * 13 - Calculadora
 * 14 - Salir
 */
import java.util.Scanner;

class EstructuraDatos {
    // Programa 1
    public static void main(String[] args) {
        // declaro mi objeto
        Scanner entrada = new Scanner(System.in);

        // variables
        int edad, opcion, socio, numerobinario, total, numerototal, n, a, b, padres, transformacion, ceros;
        int positivos = 0;
        int negativos = 0;
        double precio, bono, fahrenheit, resultado, numeroentrada;
        char letras, operacion;
        float precios = 0;
        int cantidad = 0;
        String binario = "";
        String cliente = "";

        // Vamos a crear un bucle para que se repita el programa
        try {
            do {
                // vamos a crear nuestro menu
                System.out.println("Bienvenido a la tareita que tenian que hacer wiii n_n/");
                System.out.println("Porfavor elija la opcion deseada:");
                System.out.println("1.- Descuento por edad");
                System.out.println("2.- Convertir numero decimal a binario");
                System.out.println("3.- Conversiones de temperatura");
                System.out.println("4.- Numeros positivos y negativos");
                System.out.println("5.- La tiendita");
                System.out.println("6.- Area y Perimetro");
                System.out.println("7.- Tabla");
                System.out.println("8.- Factorial");
                System.out.println("9.- Dibujitos");
                System.out.println("10.- Figuras huecas");
                System.out.println("11.- Patrones");
                System.out.println("12.- Diamante");
                System.out.println("13.- Calculadora");
                System.out.println("14.- Salir");
                opcion = entrada.nextInt();

                // nuestro switch
                switch (opcion) {
                    case 1:
                        System.out.println("Bienvenido a Gatitos.");
                        System.out.println("Ingresa tu nombre.");
                        cliente = System.console().readLine();

                        System.out.println("Hola, " + cliente + " porfavor ingresa tu edad.");
                        edad = entrada.nextInt();
                        if (edad >= 65 & edad <= 130) {
                            System.out.println(cliente + " se te aplicara un descuento de 40%.");
                        } else if (edad >= 0 & edad < 21) {
                            System.out.println(
                                    "¿" + cliente
                                            + " tus padres son socios de Gatitos? (Escribe 1.para si o 2.para no .)");
                            padres = entrada.nextInt();
                            if (padres == 1) {
                                System.out.println(cliente + " se te aplicara un descuento de 45%.");
                            } else if (padres == 2) {
                                System.out.println(cliente + " se te aplicara un descuento de 20%.");
                            } else {
                                System.out.println("Numero invalido");
                            }
                        } else if (edad < 0 || edad > 130) {
                            System.out.println("Edad invalida");
                        } else {
                            System.out.println(cliente + " se te aplicara un descuento de 20%.");
                        }
                        break;

                    case 2:
                        numerobinario = 0;
                        binario = "";
                        System.out.println("Ingrese el numero positivo entero que desee convertir a binario.");
                        numerobinario = entrada.nextInt();
                        /* comprobar si es entero positivo. */
                        if (numerobinario > 0) {
                            // Debo de aplicar el algoritmo
                            while (numerobinario > 0) {
                                if (numerobinario % 2 == 0) {
                                    binario = "0" + binario;
                                } else {
                                    binario = "1" + binario;
                                }
                                numerobinario = (int) numerobinario / 2;
                            }
                        } else if (numerobinario == 0) {
                            binario = "0";
                        } else {
                            binario = "\nNo se pudo convertir el numero ingrese solo positivos";
                        }
                        System.out.println("El numero binario es: " + binario);
                        break;

                    case 3:
                        System.out.println("Transformar grados Fahrenheit.");
                        System.out.println(
                                "A que temperatura quieres tranformar? (Elige el numero 1.Celsius 2.Kelvin 3.Rankine)");
                        transformacion = entrada.nextInt();

                        System.out.println("Dame los grados en fahrenheit a transformar");
                        fahrenheit = entrada.nextFloat();

                        switch (transformacion) {
                            case 1:
                                resultado = (fahrenheit - 32) / 1.8;
                                System.out.println(
                                        fahrenheit + " grados fahrenheit en grados celsius equivale a: " + resultado);
                                break;

                            case 2:
                                resultado = (((fahrenheit - 32) * 5) / 9) + 273.15;
                                System.out.println(
                                        fahrenheit + " grados fahrenheit en grados kelvin equivale a: " + resultado);
                                break;

                            case 3:
                                resultado = (fahrenheit + 459.67);
                                System.out.println(
                                        fahrenheit + " grados fahrenheit en grados Rankine equivale a: " + resultado);
                                break;

                            default:
                                System.out.println("Numero invalido");
                        }
                        break;

                    case 4:
                        System.out.println("Calcular la cantidad de numeros positivos y negativos.");

                        positivos = 0;
                        negativos = 0;
                        ceros = 0;
                        System.out.println("¿Que cantidad de numeros quieres evaluar?");
                        cantidad = entrada.nextInt();
                        if (cantidad < 0) {
                            System.out.println("Numero invalido.");
                        } else {
                            System.out.println(
                                    "Escribe un numero, luego presitona enter, seguido del segundo y enter, asi sucesivamente");
                            while (cantidad > 0) {
                                numeroentrada = entrada.nextDouble();
                                if (numeroentrada > 0) {
                                    positivos = positivos + 1;
                                } else if (numeroentrada == 0) {
                                    ceros = ceros + 1;
                                } else {
                                    negativos = negativos + 1;
                                }
                                cantidad = cantidad - 1;
                            }
                        }
                        System.out.println("La cantidad de numeros positivos es: " + positivos
                                + ", la  cantidad de negativos es: " + negativos + " y la  cantidad de ceros es: "
                                + ceros);
                        break;

                    case 5: // Tienda peke
                        break;

                    case 6: // Ahi lo hacen
                        System.out.println("Calcular el area y perimetro de distintas figuras geometricas.");

                        break;

                    case 7:
                        // Vamos a ver un for
                        for (n = 1; n <= 10; n++) {
                            System.out.println(n + "   " + n * 10 + "   " + n * 100 + "   " + n * 1000);
                        }
                        break;

                    case 8: // Ahi lo hacen
                        break;

                    case 9: // Ahi lo hacen
                        break;

                    case 10:
                        System.out.println("Cuadrado magico, asi kawaii, bien hueco como tu kokoro despues de elle.");
                        System.out.println("inserta el numero de unidades del lado entre 1 y 20");
                        n = entrada.nextInt();

                        if (n >= 1 && n <= 20) {
                            for (int i = 0; i < n; i++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                            for (int j = 0; j < n - 2; j++) {
                                System.out.print("*");
                                for (int k = 0; k < n - 2; k++) {
                                    System.out.print(" ");
                                }
                                System.out.println("*");
                            }
                            for (int i = 0; i < n; i++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        } else {
                            System.out.println("Error, solo entre 1 y 20");
                        }
                        break;

                    case 11: // Ahi lo hacen
                        break;

                    case 12: // Ahi lo hacen
                        break;

                    case 13:
                        // calculadora
                        System.out.println("Ingresa el primer numero");
                        a = entrada.nextInt();
                        System.out.println("Ingresa el segundo numero");
                        b = entrada.nextInt();
                        System.out.println("ingresa el tipo de operacion (+ - * /)");
                        char ope = entrada.next().charAt(0);

                        switch (ope) {
                            case '+':
                                resultado = a + b;
                                System.out.println("La suma es: " + resultado);
                                break;

                            case '-':
                                resultado = a - b;
                                System.out.println("La suma es: " + resultado);
                                break;

                            case '*':
                                resultado = a * b;
                                System.out.println("La suma es: " + resultado);
                                break;

                            case '/':
                                if (b != 0) {
                                    resultado = a / b;
                                    System.out.println("La suma es: " + resultado);
                                } else {
                                    System.out.println(
                                            "El señor del sistema web con php y bd distribuida lo va a resolver y comprobar porqeu dijo que daba igual");
                                }
                                break;

                            default:
                                System.out.println("Operacion no admitida.");
                        }

                        break;
                    default:
                        System.out.println("Valor invalido");
                }

                System.out.println("¿Deseas repetir el programa? Si lo desea escriba s");
                letras = entrada.next().charAt(0);

            } while (letras == 's' || letras == 'S');

        } catch (java.util.InputMismatchException e1) {
            System.out.println("No jalo.");
        }
    }
}