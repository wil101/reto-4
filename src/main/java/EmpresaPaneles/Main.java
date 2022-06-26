package EmpresaPaneles;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author emanuel.lopezh
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Ventas> ventas = new ArrayList();
        //ArrayList<Paneles> paneles = new ArrayList();
        ArrayList<Seguro> seguros = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        loop: while (true){
            System.out.println("¿Desea comprar un nuevo panel?");
            System.out.println("1. para comprar");
            System.out.println("2. para salir");
            int num = entrada.nextInt();
            switch(num){
                case 1:
                    System.out.println("Tipo de documento: ");
                    String doc = entrada.next();
                    System.out.println("Número de documento: ");
                    int numDoc = entrada.nextInt();
                    System.out.println("Nombre completo: ");
                    String nombre = entrada.nextLine();
                    System.out.println("Tipo de panel:");
                    System.out.println("1. Monocristalino");
                    System.out.println("2. Policristalino");
                    System.out.println("3. Película delgada");
                    System.out.println("4. CVP");
                    int tipoPanel = entrada.nextInt();
                    int precio = 0;
                switch (tipoPanel) {
                    case 1:
                        precio = 500000;
                        break;
                    case 2:
                        precio = 400000;
                        break;
                    case 3:
                        precio = 600000;
                        break;
                    case 4:
                        precio = 700000;
                        break;
                    default:
                        break;
                }
                
                    ventas.add(new Ventas(LocalDateTime.now(), doc, numDoc, nombre, precio, "Vendido"));
                    //paneles.add(new Panel());
                    System.out.println("¿Desea comprar un seguro?");
                    System.out.println("1. Para comprar un seguro");
                    System.out.println("2. Para salir");
                    int opcionSeguro = entrada.nextInt();
                    if(opcionSeguro == 1){
                        //seguros.add();
                    } else{
                        break;
                    }                 
                    break;

                case 2:
                    break loop;
                default:
                    break;
            }
        }        
    }
    
}
