package ar.edu.unahur.obj2.viajeros;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public abstract class Viajero {
    protected Pais nacionalidad;
    protected List<String> idiomas = new ArrayList<String>();

    public Viajero(Pais nacionalidad, List<String> idiomas) {
        this.nacionalidad = nacionalidad;
        this.idiomas = idiomas;
    }


    public abstract List <Pais> evaluarCondiciones(List<Pais> paises);
}
