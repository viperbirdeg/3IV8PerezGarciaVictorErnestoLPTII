public class Conejo extends Animal {
    private int salto;

    public Conejo() {

    }
    //Buscar caracteristica de los Conejos
    public Conejo(String nombre, String raza, String tipoAlimento, int edad, int salto) {
        /*
         * Para poder acceder a los atributos heredados, usamos la palabra reservada
         * super
         */
        super(nombre, raza, tipoAlimento, edad);
        this.salto = salto;
    }

    // get
    public int getSalto() {
        return salto;
    }

    // set
    public void setSalto(int salto) {
        this.salto = salto;
    }

    public void mostrarConejo() {
        System.out.println(
                "El nombre del conejo es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: "
                        + getTipoAlimento() + "\n" + "Su edad es: " + getEdad() + "\n"
                        + "Salta la cantidad de: "
                        + salto + " metros." + "\n");
    }
}
