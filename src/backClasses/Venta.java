/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backClasses;

import java.sql.Date;

/**
 *
 * @author David Carmona
 */

/*
idVenta int(7) primary key not null auto_increment,
idCliente varchar(10),
fecha_venta date,
ivaAcumPag_venta float,
costoAd_venta float,
total_venta float,
foreign key(idCliente) references Clientes(idCliente) on delete cascade on update cascade
*/

public class Venta {
    private long id;
    private String idCliente;
    private java.sql.Date fecha;
    private float iva;
    private float costo;
    private float total;

    public Venta() {

    }
    
    public Venta(long id, String idCliente, Date fecha, float iva, float costo, float total) {
        this.id = id;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.iva = iva;
        this.costo = costo;
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
