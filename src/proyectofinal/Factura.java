package proyectofinal;

/**
 *
 * @author brand
 */
public class Factura extends Producto{
    
    protected String fecha;
    protected String numerofactura;
    protected int cantidadproducto;

    public Factura(String fecha, String numerofactura, int cantidadproducto, String idproducto, String nombreproducto, int stock, double precionormal, double precioafiliado, double descuento) {
        super(idproducto, nombreproducto, stock, precionormal, precioafiliado, descuento);
        this.fecha = fecha;
        this.numerofactura = numerofactura;
        this.cantidadproducto = cantidadproducto;
    }

    public Factura(String fecha, String numerofactura, int cantidadproducto, String idproducto, String nombreproducto, int stock, double precionormal) {
        super(idproducto, nombreproducto, stock, precionormal);
        this.fecha = fecha;
        this.numerofactura = numerofactura;
        this.cantidadproducto = cantidadproducto;
    }

    public Factura(String fecha, String numerofactura, int cantidadproducto) {
        this.fecha = fecha;
        this.numerofactura = numerofactura;
        this.cantidadproducto = cantidadproducto;
    }
    
    

    public Factura() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(String numerofactura) {
        this.numerofactura = numerofactura;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(int cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }
}
