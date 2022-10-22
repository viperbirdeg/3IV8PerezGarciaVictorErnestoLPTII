public class Huron extends Animal {
    private int salto;

    public Huron() {

    }
    //Buscar caracteristica de los hurones
    public Huron(String nombre, String raza, String tipoAlimento, int edad, int salto) {
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

    public void mostrarHuron() {
        System.out.println(
                "El nombre del huron es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: "
                        + getTipoAlimento() + "\n" + "Su edad es: " + getEdad() + "\n"
                        + "Salta la cantidad de: "
                        + salto + " metros." + "\n");
    }
}
