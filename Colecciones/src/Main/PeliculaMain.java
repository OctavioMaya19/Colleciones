package Main;

import Entidad.Pelicula;
import Service.PeliculaService;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaMain {

    public static void main(String[] args) {
        
        PeliculaService peliServ = new PeliculaService();
        ArrayList <Pelicula> pelis = peliServ.cargarPelicula();
        peliServ.mostrarPelis(pelis);
        peliServ.mayorDuracion(pelis);
        peliServ.menorDuracion(pelis);
        peliServ.ordenarDuracionMayor(pelis);
        peliServ.ordenarDuracionMenor(pelis);
        peliServ.ordenarTitulo(pelis);
        peliServ.ordenarDirector(pelis);
    }
    
}
