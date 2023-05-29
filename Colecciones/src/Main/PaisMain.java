package Main;

import Service.PaisService;
import java.util.HashSet;

public class PaisMain {

    public static void main(String[] args) {
        HashSet<String> paises = new HashSet();
        PaisService paisesServ = new PaisService();
        
        paisesServ.ingresaPaises(paises);
        paisesServ.mostrarPaises(paises);
        paisesServ.ordenarPaises(paises);
        paisesServ.eliminarPais(paises);
    }
    
}
