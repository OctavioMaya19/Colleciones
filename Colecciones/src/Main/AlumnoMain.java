package Main;

import Entidad.Alumno;
import Service.AlumnoService;
import java.util.ArrayList;

public class AlumnoMain {

    public static void main(String[] args) {
        
        AlumnoService alumServ = new AlumnoService();
        ArrayList<Alumno> alumnos = alumServ.crearListaAlumnos();
        
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
        System.out.println("--------------------------------");
        alumServ.confirmacion(alumnos);
        
    }
    
}
