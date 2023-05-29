package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MascotaApp {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> nombre = new ArrayList();

        boolean conf = true;

        do {
            System.out.println("ingrese un nombre de perro");
            nombre.add(leer.next());
            System.out.println("desea continuar? (si/no)");
            if (leer.next().equalsIgnoreCase("no")) {
                conf = false;
            }
        } while (conf);

        System.out.println("----------------------------");
        System.out.println("los perros son:");
        for (String nombres : nombre) {
            System.out.println(nombres);
        }
        
        Iterator<String> it = nombre.iterator();
        System.out.println("----------------------------");
        System.out.println("ingrese el nombre del perro que desea eliminar");
        String eliminar = leer.next();
        
        boolean noEncontrado = true;
        while (it.hasNext()) {
            if (it.next().equals(eliminar)) {
                it.remove();
                noEncontrado = false;
            }
        }
        if (noEncontrado) {
            System.out.println("el perro que ingresó NO está en la lista");
        }
        System.out.println("----------------------------");
        System.out.println("Lista:");
        Collections.sort(nombre);
        for (String nombres : nombre) {
            System.out.println(nombres);
        }
        

        /*int cont=0;
        while (cont<1) {
            System.out.println("ingrese un nombre de perro");
            nombre.add(leer.next());
            System.out.println("desea continuar? (si/no)");
            String opcion = leer.next();
            
            switch (opcion) {
                case "si":
                    break;
                case "no":
                    cont++;
                    break;
                default:
                    System.out.println("caracter erroneo");
                    cont++;
            }

        }
        System.out.println("----------------------------");
        System.out.println("los perros son:");
        for (String nombres : nombre) {
            System.out.println(nombres);
        }*/
    }

}
