import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import edu.upc.dsa.Controller.EtakemonManagerImpl;
import edu.upc.dsa.Model.Etakemon;
import org.apache.log4j.Logger;
import edu.upc.dsa.Controller.EtakemonManager;


import java.util.List;


public class Main {
    private static final Logger log4j = Logger.getLogger(Main.class);
    public static void main(String[] args) {

       List<Etakemon> etakemons;

        Etakemon e = new Etakemon();
        e.nombre = "Juan";
        e.tipo = "Fuego";
        e.nivel = 10;

        Etakemon e2 = new Etakemon();
        e2.nombre = "Toni";
        e2.tipo = "Agua";
        e2.nivel = 10;

        Etakemon e3 = new Etakemon();
        e3.nombre = "Lluis";
        e3.tipo = "Tierra";
        e3.nivel = 10;

        Etakemon e4 = new Etakemon();
        e4.nombre = "Juan";
        e4.tipo = "Ghost";
        e4.nivel = 10;



        EtakemonManager g = new EtakemonManager();


        g.addEtakemonToList(e);
        g.addEtakemonToList(e2);
        g.addEtakemonToList(e3);



        System.out.println("Los imprimo por pantalla:");
        for (Etakemon f : g.getList()) {
            System.out.println(f.nombre);
        }

        System.out.println("");

        System.out.println("Borro Etakemon a Toni");
        g.delEtakemonFromList(1);

        System.out.println("");


        System.out.println("Imprimir por pantalla:");
        for (Etakemon f : g.getList()) {
            System.out.println(f.nombre);
        }
        System.out.println("");

        System.out.println("Busco los Eetakemons que se llamen \"Juan\" de la lista y muestro sus atributos:");
        etakemons = g.getEtakemonFromList("Juan");
        for (Etakemon f : g.getList()) {
            if (f.nombre.equals("Juan")) {
                etakemons.add(f);
            }
        }for (Etakemon f: etakemons) {
            System.out.println("Id: "+f.id);
            System.out.println("Nombre: "+f.nombre);
            System.out.println("Tipo: "+f.tipo);
            System.out.println("Nivel: "+f.nivel);
            System.out.println("");
        }


    }
}
 {
}
