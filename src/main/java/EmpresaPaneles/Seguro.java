
package EmpresaPaneles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author wilmar.osorio
 */
public class Seguro {
    String nombreEmpresa,descripcion, fechaInicial, fechaFinal;
    int id;
    private static int existencias;

    public Seguro(String nombreEmpresa, String descripcion, int id, String fechaInicial, String fechaFinal) {
        existencias++;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
        this.id = 20220600 + existencias++;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }
    
   public int getNumDiasCobertura() throws ParseException{
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       Date a = dateFormat.parse(fechaInicial);
       Date b = dateFormat.parse(fechaFinal);
       int dias = (int) ((b.getTime() - a.getTime()) / 86400000);
       return dias;
   }
   
    public static int getExistencias() {
        return existencias;
    }
   public Seguro(){
       
   }
}
