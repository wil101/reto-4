package EmpresaPaneles;

import java.time.LocalDateTime;

/**
 * @author emanuel.lopezh
 */
public class Ventas {
    private int id;
    private LocalDateTime fechaYHora;
    private String tipoDeDocumento;
    private int numDocumento;
    private String nombre;
    private int precio;
    private String descripcion;
    private static int existencias;

    public Ventas(LocalDateTime fechaYHora, String tipoDeDocumento, 
            int numDocumento, String nombre, int precio, String descripcion) {
        
        existencias++;
        this.id = 202206000 + existencias;
        this.fechaYHora = fechaYHora;
        this.tipoDeDocumento = tipoDeDocumento;
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public static int getExistencias() {
        return existencias;
    }
    
    
    
}
