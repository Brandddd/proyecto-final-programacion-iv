/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;
import java.util.ArrayList;

/**
 *
 * @author brand
 */
public class Caja {
    protected boolean estado;
    protected ArrayList<Factura> facturas = new ArrayList<>();

    public Caja(boolean estado) {
        this.estado = estado;
    }

    public Caja() {
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }
    
    public void abrirCaja (){
        this.estado = true;
    }
    
    public void cerrarCaja (){
        this.estado = false;
    }
}
