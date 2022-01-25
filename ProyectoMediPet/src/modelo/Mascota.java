package modelo;

import javax.swing.JOptionPane;

public class Mascota {
        private int id;
        private String nombre;
        private int edad;
        private String tipo;
        private boolean posee_atencion;
        private int cantidad;
        private boolean posee_dueno;
        private String nombre_dueno;
        private String descripcion;

    public Mascota() {
        this.id = 0;
        this.nombre = "";
        this.edad = 0;
        this.tipo = "";
        this.posee_atencion = false;
        this.cantidad = 0;
        this.posee_dueno = false;
        this.nombre_dueno = "";
        this.descripcion = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    
    public String getNombre() { 
        
            return nombre;
    }
        

    public void setNombre(String nombre) {
       this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        
        
        this.edad = edad;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        
        this.tipo = tipo;
        
        }

    public boolean isPosee_atencion() {
        return posee_atencion;
    }

    public void setPosee_atencion(boolean posee_atencion) {
        this.posee_atencion = posee_atencion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isPosee_dueno() {
        return posee_dueno;
    }

    public void setPosee_dueno(boolean posee_dueno) {
        this.posee_dueno = posee_dueno;
    }

    public String getNombre_dueno() {
        return nombre_dueno;
    }

    public void setNombre_dueno(String nombre_dueno) {
        this.nombre_dueno = nombre_dueno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
        
        
    
}
