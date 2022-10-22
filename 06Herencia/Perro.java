
public class Perro extends Animal {

    private String ladrido;

    public Perro() {

    }

    public Perro(String nombre, String raza, String tipoAlimento, int edad, String ladrido) {
        /*
         * Para poder acceder a los atributos heredados, usamos la palabra reservada
         * super
         */
        super(nombre, raza, tipoAlimento, edad);
        this.ladrido = ladrido;
    }

    // get
    public String getLadrido() {
        return ladrido;
    }

    // set
    public void setLadrido(String ladrido) {
        this.ladrido = ladrido;
    }

    public void mostrarPerro() {
        System.out.println(
                "El nombre del perro es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: "
                        + getTipoAlimento() + "\n" + "Su edad es: " + getEdad() + "\n" + "Su ladrido es: " + ladrido
                        + "\n");
    }

}
