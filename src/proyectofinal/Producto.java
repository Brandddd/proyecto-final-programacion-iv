package proyectofinal;

/**
 *
 * @author brand
 */
public class Producto extends Cliente{
    
    protected String idproducto;
    protected String nombreproducto;
    protected int stock;
    protected double precionormal;
    protected double precioafiliado;
    static double descuento = 0.20;
    static double iva = 0.19;

    public Producto(String idproducto, String nombreproducto, int stock, double precionormal, double precioafiliado, double descuento) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.stock = stock;
        this.precionormal = precionormal;
        this.precioafiliado = precioafiliado;
        Producto.descuento = descuento;
    }

    public Producto(String idproducto, String nombreproducto, int stock, double precionormal) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.stock = stock;
        this.precionormal = precionormal;
        this.precioafiliado = this.precionormal - (this.precionormal * Producto.descuento);
    }

    public Producto(String idproducto, String nombreproducto, int stock, double precionormal, double precioafiliado, double descuento, String tipocliente, String nombre, String apellido, String id) {
        super(tipocliente, nombre, apellido, id);
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.stock = stock;
        this.precionormal = precionormal;
        this.precioafiliado = precioafiliado;
        Producto.descuento = descuento;
    }

    public Producto(String idproducto, String nombreproducto, double precionormal, String tipocliente, String nombre, String id) {
        super(tipocliente, nombre, id);
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.precionormal = precionormal;
    }

    public Producto(String idproducto, String nombreproducto, double precioafiliado, double descuento, String tipocliente, String nombre, String id) {
        super(tipocliente, nombre, id);
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.precioafiliado = precioafiliado;
        Producto.descuento = descuento;
    }

    public Producto() {
        
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecionormal() {
        return precionormal;
    }

    public void setPrecionormal(double precionormal) {
        this.precionormal = precionormal;
    }

    public double getPrecioafiliado() {
        return precioafiliado;
    }

    public void setPrecioafiliado(double precioafiliado) {
        this.precioafiliado = precioafiliado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        Producto.descuento = descuento;
    }

    public static double getIva() {
        return iva;
    }

    public static void setIva(double iva) {
        Producto.iva = iva;
    }
    
    public double calcularIva (String tipocliente){
        
        if (tipocliente.equalsIgnoreCase("Afiliado")){
            return this.precioafiliado + (this.precioafiliado * Producto.iva);
        }else if (tipocliente.equalsIgnoreCase("Comun")){
            return this.precionormal + (this.precionormal * Producto.iva);
        }
        return 0;
    }
}
