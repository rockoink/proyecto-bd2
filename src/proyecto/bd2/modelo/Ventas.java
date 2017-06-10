/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.bd2.modelo;

/**
 *
 * @author Sony
 */
public class Ventas {

private Integer idVentas;
private Integer numeroCliente;
private Integer numeroVendedor;
private Float montoVenta;

    public Ventas(Integer idVentas, Integer numeroCliente, Integer numeroVendedor, Float montoVenta) {
        this.idVentas = idVentas;
        this.numeroCliente = numeroCliente;
        this.numeroVendedor = numeroVendedor;
        this.montoVenta = montoVenta;
    }

    public Ventas() {
    }

    /**
     * @return the idVentas
     */
    public Integer getIdVentas() {
        return idVentas;
    }

    /**
     * @param idVentas the idVentas to set
     */
    public void setIdVentas(Integer idVentas) {
        this.idVentas = idVentas;
    }

    /**
     * @return the numeroCliente
     */
    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    /**
     * @param numeroCliente the numeroCliente to set
     */
    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    /**
     * @return the numeroVendedor
     */
    public Integer getNumeroVendedor() {
        return numeroVendedor;
    }

    /**
     * @param numeroVendedor the numeroVendedor to set
     */
    public void setNumeroVendedor(Integer numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    /**
     * @return the montoVenta
     */
    public Float getMontoVenta() {
        return montoVenta;
    }

    /**
     * @param montoVenta the montoVenta to set
     */
    public void setMontoVenta(Float montoVenta) {
        this.montoVenta = montoVenta;
    }
    
}
