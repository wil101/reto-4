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

    public Ventas(int id, LocalDateTime fechaYHora, String tipoDeDocumento, 
            int numDocumento, String nombre, int precio, String descripcion) {
        
        this.id = id;
        this.fechaYHora = fechaYHora;
        this.tipoDeDocumento = tipoDeDocumento;
        this.numDocumento = numDocumento;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public static int getExistencias() {
        return existencias;
    }
    
    
    
}
