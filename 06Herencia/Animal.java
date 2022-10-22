
public class Animal {

    /*
     * Es poder restringir el acceso a los tipos de dato. Vamos a poder agrupar en
     * una clase el acceso a los diferentes metodos u objetos de clase, para que no
     * puedan ser modificados
     */

    private String nombre, raza, tipoAlimento;
    private int edad;

    /*
     * Definimos el constructo
     * este nos sirve para poder declarar la existencia de una clase, inicializar
     * las variables y poder crear instancias de objetos
     */

    public Animal() {
        // Vacio
    }

    // Sobrecarga de metodo
    public Animal(String nombre, String raza, String tipoAlimento, int edad) {
        // Para poder definir los parametros de acceso a las variables
        this.nombre = nombre;
        this.raza = raza;
        this.tipoAlimento = tipoAlimento;
        this.edad = edad;
    }

    /*
     * Para poder
     * get -> obtener -> recibir
     * set -> asignar -> enviar
     */

    // get
    public String getNombre() {
        return nombre;
    }

    // set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // get
    public String getRaza() {
        return raza;
    }

    // set
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // get
    public String getTipoAlimento() {
        return tipoAlimento;
    }

    // set
    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    // get
    public int getEdad() {
        return edad;
    }

    // set
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
