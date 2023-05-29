package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TiendaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresaProductos(HashMap<String, Integer> producto) {
        boolean conf = true;
        System.out.println("ingrese la informacion del producto");
        do {
            System.out.print("producto: ");
            String prod = leer.next();
            System.out.print("precio: $");
            Integer precio = leer.nextInt();
            producto.put(prod, precio);
            System.out.println("desea ingresar otro producto? (si/no)");
            if (leer.next().equalsIgnoreCase("no")) {
                conf = false;
            }
            System.out.println("");

        } while (conf);
    }

    public void mostrarProductos(HashMap<String, Integer> producto) {
        TreeMap<String, Integer> productosTree = new TreeMap(producto);
        for (Map.Entry<String, Integer> entry : productosTree.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("producto: " + entry.getKey()+ " precio: $" + entry.getValue());
        }

    }

    public void modificarPercio(HashMap<String, Integer> producto) {
        if (!producto.isEmpty()) {
            System.out.println("ingrese el producto al que desea modificar el precio");
            String remplaza = leer.next();

            if (producto.containsKey(remplaza)) {
                System.out.println("ingrese el nuevo precio");
                Integer precioRemplaze = leer.nextInt();
                producto.replace(remplaza, precioRemplaze);
            } else {
                System.out.println("no existe ese producto");
            }

        } else {
            System.out.println("aún no hay productos ingresados");
        }
    }

    public void eliminarProducto(HashMap<String, Integer> producto) {
        if (!producto.isEmpty()) {
            System.out.println("ingrese el producto que desea eliminar");
            String eliminarProd = leer.next();

            if (producto.containsKey(eliminarProd)) {
                producto.remove(eliminarProd);
            } else {
                System.out.println("no existe ese producto");
            }

        } else {
            System.out.println("aún no hay productos ingresados");
        }
    }

}
