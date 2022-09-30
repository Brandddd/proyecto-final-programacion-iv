package proyectofinal;

/**
 *
 * @author brand
 */
public class Cliente extends Persona{
    
    protected String tipocliente;

    public Cliente(String tipocliente, String nombre, String apellido, String id) {
        super(nombre, apellido, id);
        this.tipocliente = tipocliente;
    }

    public Cliente(String tipocliente, String nombre, String id) {
        super(nombre, id);
        this.tipocliente = tipocliente;
    }

    public Cliente(String tipocliente) {
        this.tipocliente = tipocliente;
    }

    public Cliente() {
    }

    public String getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void imprimirCliente(){
        System.out.printf("\nCLIENTE AÑADIDO SATISFACTORIAMENTE CON LOS SIGUIENTES DATOS: \n");
        System.out.printf("Tipo de Cliente: %s \n", this.getTipocliente());
        System.out.printf("Nombre del Cliente: %s \n", this.getNombre());
        System.out.printf("Apellido del Cliente: %s \n", this.getApellido());
        System.out.printf("Identificacion del Cliente: %s \n", this.getId());
    }
}