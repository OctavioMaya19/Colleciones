package Main;

import Service.TiendaService;
import java.util.HashMap;
import java.util.Scanner;

public class TiendaMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        HashMap <String, Integer> productos = new HashMap();
        TiendaService producto = new TiendaService();
        
        boolean confir = true;
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1_ Ingresar producto");
            System.out.println("2_ Mostrar productos");
            System.out.println("3_ Modificar precio");
            System.out.println("4_ Eliminar producto");
            System.out.println("5_ Salir");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    producto.ingresaProductos(productos);
                    break;
                case 2:
                    producto.mostrarProductos(productos);
                    break;
                case 3:
                    producto.modificarPercio(productos);
                    break;
                case 4:
                    producto.eliminarProducto(productos);
                    break;
                case 5:
                    System.out.println("seguro desea salir? (si/no)");
                    String salida = leer.next();
                    if (salida.equalsIgnoreCase("si")) {
                        System.out.println("has salido");
                        confir = false;
                    }
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
            
        } while (confir);
        
    }
    
}
