
package EmpresaPaneles;

/**
 *
 * @author wilmar.osorio1
 */
public class Panel {
    int id,numeroDeSerie,modelo,precio;
    String tipoDepanel,descripcion;
    int anioDeFabricacion;
    private static int existencias;

    public Panel(int numeroDeSerie, int modelo, int precio, String tipoDepanel, 
            String descripcion, int anioDeFabricacion) {
        existencias++;
        this.id = 202206000 + existencias;
        this.numeroDeSerie = 22200 + existencias;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoDepanel = tipoDepanel;
        this.descripcion = descripcion;
        this.anioDeFabricacion = anioDeFabricacion;
        
    }
    
    public int getId(){
        return id;
    }
    public static int getExistencias() {
        return existencias;
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

