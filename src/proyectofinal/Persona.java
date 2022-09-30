package proyectofinal;

/**
 *
 * @author brand
 */
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String id;

    public Persona(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Persona() {
    }
}
