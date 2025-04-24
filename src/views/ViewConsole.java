package views;
import models.Persona;

public class ViewConsole {
    
    public void printArray(Persona[] persona){
        for(Persona p : persona){
            System.out.println(p);
        }
    }
}
