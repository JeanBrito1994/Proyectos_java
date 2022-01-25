/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Usuario
 */
public class Orden {
    
    private String id;
    private String descripcion;
    private String empleado;
    private String proveedorn;  
    private int total;

    public Orden() {
        this.id = "";
        this.descripcion = "";
        this.empleado = "";
        this.proveedorn = "";
        this.total = 0;
    }
    


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getProveedorn() {
        return proveedorn;
    }

    public void setProveedorn(String proveedorn) {
        this.proveedorn = proveedorn;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
    


    
    
}
