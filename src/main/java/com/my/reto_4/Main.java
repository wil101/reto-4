package EmpresaPaneles;

import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author emanuel.lopezh
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Ventas venta = new Ventas(LocalDateTime.of(2022, Month.JUNE, 4, 5, 30), "cedula", 1000662113, "Emanuel", 24000, "Messi");
        System.out.println(venta.getId());;
        
        Ventas nuevaVenta = new Ventas(LocalDateTime.of(2022, Month.MARCH, 5, 6, 10), "cédula", 1000622134, "Santiago", 25000, "Messi");
        System.out.println(nuevaVenta.getId());
    }
    
}
