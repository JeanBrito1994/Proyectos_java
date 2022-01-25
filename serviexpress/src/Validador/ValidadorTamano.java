/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

/**
 *
 * @author Acer
 */
public class ValidadorTamano {
  
    public static void validarTamanoTexto(String texto,
            int tamanoInicial, int tamanoFinal,
            String nombreCampo) throws Exception{
    
        
        if(texto.length() < tamanoInicial ||
                texto.length() > tamanoFinal){
        
            String mensajeError = "EL TAMAÑO DE " +
                    nombreCampo + " DEBE SER MAYOR QUE "  +
                    tamanoInicial + " Y MENOR QUE " +
                    tamanoFinal;
            
            throw new Exception(mensajeError);
        }        
    }
    
    public void validarTextoVacio(String texto, 
            String nombreCampo) throws Exception{
    
        
        if(texto == null || "".equals(texto)){
            
            String mensajeError = "DEBE INGRESAR " +
                    "INFORMACIÓN EN EL CAMPO " + 
                    nombreCampo;
            
            throw new Exception(mensajeError);
        }
        
    }
}
