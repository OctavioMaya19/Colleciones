package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearListaAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList();
        boolean confirmacion = true;
        do {
            Alumno alumno = new Alumno();
            System.out.println("ingrese el nombre del alumno");
            alumno.setNombre(leer.next());
            System.out.println("ingrese las notas del alumno");
            ArrayList<Integer> nota = new ArrayList();
            for (int i = 0; i < 3; i++) {
                nota.add(leer.nextInt());
            }
            alumno.setNotas(nota);
            alumnos.add(alumno);
            System.out.println("desea ingresar otro alumno? (si/no)");
            if (leer.next().equalsIgnoreCase("no")) {
                confirmacion = false;
            }

        } while (confirmacion);

        return alumnos;
    }

    public void confirmacion(ArrayList<Alumno> alumnos) {
        System.out.println("ingrese el nombre del alumno para obtener sus notas");
        String obtenerNotas = leer.next();
        Iterator<Alumno> ite = alumnos.iterator();
        Alumno alumnoAux = ite.next();
        
        while (ite.hasNext()) {
            if (alumnoAux.getNombre().equals(obtenerNotas)) {
                promedio(alumnoAux);
                break;
            }
        }
    }
    
    public void promedio(Alumno alumno){
        double sumaNotas = 0;
        for (Integer nota : alumno.getNotas()) {
            sumaNotas += nota;
        }
        double promedio = sumaNotas/alumno.getNotas().size();
        System.out.println("el promedio es: " + promedio);
    }
    
}
