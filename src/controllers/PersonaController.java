package controllers;

import models.Persona;

public class PersonaController {

    public void sortByDirrecionCodigo(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < personas.length; j++) {
                //if (personas[j].getCodigoDireccion() > personas[maxIdx].getCodigoDireccion() ) 
                if (personas[j].equalsByCodigoDireccion(personas[maxIdx])){
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                Persona aux = personas[maxIdx];
                personas[maxIdx] = personas[i];
                personas[i] = aux;
            }
        }
    }

    public Persona findByCodigoDireccion(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length-1;

        while(bajo<=alto){
            int centro = (alto+bajo)/2;
            int valorCentral= personas[centro].getCodigoDireccion();
            //if(personas[centro].getCodigoDireccion() == codigo)
            //if(personas[centro].equalsByCodigoDireccion(codigo))
            if(valorCentral == codigo)
            return personas[centro];
            if(valorCentral>codigo){
            bajo = centro+1;
            } else{
            alto = centro-1;
            }
        }
        return null;
    }
}
