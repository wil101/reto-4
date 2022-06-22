
package com.my.reto_4;

/**
 *
 * @author wilmar.osorio1
 */
public class panel {
    int id,numeroDeSerie,modelo,precio;
    String tipoDepanel,descripcion;
    int anioDeFabricacion;

    public panel(int id, int numeroDeSerie, int modelo, int precio, String tipoDepanel, 
            String descripcion, int anioDeFabricacion) {
        this.id = id;
        this.numeroDeSerie = numeroDeSerie;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoDepanel = tipoDepanel;
        this.descripcion = descripcion;
        this.anioDeFabricacion = anioDeFabricacion;
    }
    
    public void getTiempoDeUso(){
    String uso = "";
        if(anioDeFabricacion > 0 && anioDeFabricacion <= 1){
            uso = "nuevo";
       }else if(anioDeFabricacion > 2 && anioDeFabricacion <= 4){
            uso = "medianamente usado";
       }else if (anioDeFabricacion > 5){
            uso = "usado";
       }
        System.out.println("el tiempo de uso del panel es" + uso);
        
    }
    
}


    

