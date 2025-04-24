
import controllers.PersonaController;
import models.Direccion;
import models.Persona;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {

        Persona[] personas = new Persona[5];


        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5",56, 89));


        ViewConsole viewConsole = new ViewConsole();
        PersonaController pController = new PersonaController();

        viewConsole.printArray(personas);
        pController.sortByDirrecionCodigo(personas);
        viewConsole.printArray(personas);
        Persona pBuscada = pController.findByCodigoDireccion(personas, 89);
        if( pBuscada == null){
            System.out.println("No se ha encontrado la persona");
        }else{
            System.out.println("La persona buscada es: "+ pBuscada);
        }
    }
}
