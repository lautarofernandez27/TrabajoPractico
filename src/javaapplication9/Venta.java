package javaapplication9;
// Generated Aug 10, 2017 6:10:05 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private VentaId id;
     private Date fecha;
     private Long cantidad;

    public Venta() {
    }

	

    public Venta(VentaId id, Date fecha, Long cantidad) {
       this.id = id;
       this.fecha = fecha;
       this.cantidad = cantidad;
    }
   
    public VentaId getId() {
        return this.id;
    }
    
    public void setId(VentaId id) {
        this.id = id;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Long getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }




}


