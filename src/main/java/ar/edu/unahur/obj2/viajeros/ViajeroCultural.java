package ar.edu.unahur.obj2.viajeros;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.filters.FiltroPoblacionMenorA;
import ar.edu.unahur.obj2.filters.IFiltro;
import ar.edu.unahur.obj2.model.Pais;

public class ViajeroCultural extends Viajero{

    List<Pais> paisesVisitados = new ArrayList<Pais>();

    public ViajeroCultural(Pais nacionalidad, List<String> idiomas, List<Pais> paisesVisitados) {
        super(nacionalidad, idiomas);
        this.paisesVisitados = paisesVisitados;
    }

    @Override
    public List<Pais> evaluarCondiciones(List<Pais> paises) {
        IFiltro filtros = new FiltroPoblacionMenorA(this.nacionalidad.getPoblacion());
        return paises.stream().filter(p -> filtros.aplicar(p)).toList();
    }
}
