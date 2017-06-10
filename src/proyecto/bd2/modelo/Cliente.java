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
public class Cliente {
private Integer numeroCliente;
private Integer numeroAlmacen;
private String nombreCliente;

    public Cliente(Integer numeroCliente, Integer numeroAlmacen, String nombreCliente) {
        this.numeroCliente = numeroCliente;
        this.numeroAlmacen = numeroAlmacen;
        this.nombreCliente = nombreCliente;
    }

    public Cliente() {
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
     * @return the numeroAlmacen
     */
    public Integer getNumeroAlmacen() {
        return numeroAlmacen;
    }

    /**
     * @param numeroAlmacen the numeroAlmacen to set
     */
    public void setNumeroAlmacen(Integer numeroAlmacen) {
        this.numeroAlmacen = numeroAlmacen;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
}
