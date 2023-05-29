package Service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresaPaises(HashSet<String> paises){
        boolean conf = true;
        
        do {
            System.out.println("ingrese un pais");
            paises.add(leer.next());
            
            System.out.println("desea ingresar otra pelicula? (si/no)");
            if(leer.next().equalsIgnoreCase("no")){
                conf = false;
            }
            
        } while (conf);
        System.out.println("paises ingresados: ");
    } 
    
    public void mostrarPaises(HashSet<String> paises){
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
    
    public void ordenarPaises(HashSet<String> paises){
        TreeSet<String> paisesTree = new TreeSet(paises);
        System.out.println("paises ordenados alfabeticamente: ");
        for (String pais : paisesTree) {
            System.out.println(pais);
        }
    }
    
    public void eliminarPais(HashSet<String> paises){
        System.out.println("ingrese el paise que desee eliminar");
        Iterator<String> ite = paises.iterator();
        String paisEliminar = leer.next();
        
        boolean noEncontrado = true;
        while (ite.hasNext()){
            if (ite.next().equals(paisEliminar)) {
                ite.remove();
                noEncontrado = false;
                break;
            }
        }
        if (noEncontrado){
            System.out.println("el pais ingresado no está en la lista");
        }
        System.out.println("lista de paises: ");
        for (String paise : paises) {
            System.out.println(paise);
        }
    }
}
