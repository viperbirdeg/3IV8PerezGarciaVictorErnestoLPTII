
public class Gato extends Animal {

    private int num_vidas;

    public Gato() {

    }

    public Gato(String nombre, String raza, String tipoAlimento, int edad, int num_vidas) {
        /*
         * Para poder acceder a los atributos heredados, usamos la palabra reservada
         * super
         */
        super(nombre, raza, tipoAlimento, edad);
        this.num_vidas = num_vidas;
    }

    // get
    public int getNumVidas() {
        return num_vidas;
    }

    // set
    public void setNumVidas(int num_vidas) {
        this.num_vidas = num_vidas;
    }

    public void mostrarGato() {
        System.out.println(
                "El nombre del gato es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: "
                        + getTipoAlimento() + "\n" + "Su edad es: " + getEdad() + "\n"
                        + "Su numero de vidas restantes es: "
                        + num_vidas + "\n");
    }

}
