package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Pelicula> cargarPelicula(){
        ArrayList<Pelicula> pelis = new ArrayList();
        boolean conf = true;
        
        do {
            Pelicula peli = new Pelicula();
            System.out.println("ingrese el titulo de la pelicula");
            peli.setTitulo(leer.next());
            System.out.println("ingrese el director de la pelicula");
            peli.setDirector(leer.next());
            System.out.println("ingrese la duracion de la pelicula");
            peli.setDuracion(leer.nextDouble());
            pelis.add(peli);
            System.out.println("desea ingresar otra pelicula? (si/no)");
            if(leer.next().equalsIgnoreCase("no")){
                conf = false;
            }
            
        } while (conf);
        System.out.println("---------------------------------------");

        return pelis;
    }
    
    public void mostrarPelis(ArrayList<Pelicula> pelis){
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
    }
    
    public void mayorDuracion(ArrayList<Pelicula> pelis){
        System.out.println("---------------------------------------");
        System.out.println("peliculas de duracion mayor a 1 hora");
        for (Pelicula peli : pelis) {
            if (peli.getDuracion()>1) {
                System.out.println(peli);
            }
        }
        System.out.println("---------------------------------------");
    }
    
    public void menorDuracion(ArrayList<Pelicula> pelis){
        System.out.println("peliculas de duracion menor a 1 hora");
        for (Pelicula peli : pelis) {
            if (peli.getDuracion()<1) {
                System.out.println(peli);
            }
        }
        System.out.println("---------------------------------------");
    }
    
    public void ordenarDuracionMayor(ArrayList<Pelicula> pelis){
        System.out.println("pelicualas ordenadas de mayor a menor segun la duración");
        pelis.sort(Pelicula.comparaDuracion);
        mostrarPelis(pelis);
        System.out.println("---------------------------------------");
    }
    
    public void ordenarDuracionMenor(ArrayList<Pelicula> pelis){
        System.out.println("peliculas ordenadas de menor a mayor segun la duración");
        pelis.sort(Pelicula.comparaDuracion);
        Collections.reverse(pelis);
        mostrarPelis(pelis);
        System.out.println("---------------------------------------");
    }
    
    public void ordenarTitulo(ArrayList<Pelicula> pelis){
        System.out.println("peliculas ordenadas alfabeticamente por titulo");
        pelis.sort(Pelicula.compararTitulo);
        mostrarPelis(pelis);
        System.out.println("---------------------------------------");
    }
    
    public void ordenarDirector(ArrayList<Pelicula> pelis){
        System.out.println("peliculas ordenadas alfabeticamente por director");
        pelis.sort(Pelicula.compararDirector);
        mostrarPelis(pelis);
        System.out.println("---------------------------------------");
    }
    
}
