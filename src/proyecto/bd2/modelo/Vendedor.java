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
public class Vendedor {
    private Integer numeroVendedor;
    private String nombreVendedor;
    private String areaVentas;

    public Vendedor(Integer numeroVendedor, String nombreVendedor, String areaVentas) {
        this.numeroVendedor = numeroVendedor;
        this.nombreVendedor = nombreVendedor;
        this.areaVentas = areaVentas;
    }

    public Vendedor() {
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
     * @return the nombreVendedor
     */
    public String getNombreVendedor() {
        return nombreVendedor;
    }

    /**
     * @param nombreVendedor the nombreVendedor to set
     */
    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    /**
     * @return the areaVentas
     */
    public String getAreaVentas() {
        return areaVentas;
    }

    /**
     * @param areaVentas the areaVentas to set
     */
    public void setAreaVentas(String areaVentas) {
        this.areaVentas = areaVentas;
    }
}
