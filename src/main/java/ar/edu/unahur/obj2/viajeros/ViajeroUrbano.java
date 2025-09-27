package ar.edu.unahur.obj2.viajeros;

import java.util.List;

import ar.edu.unahur.obj2.filters.*;
import ar.edu.unahur.obj2.filters.IFiltro;
import ar.edu.unahur.obj2.model.Pais;

public class ViajeroUrbano extends Viajero{

    
    public ViajeroUrbano(Pais nacionalidad, List<String> idiomas) {
        super(nacionalidad, idiomas);
    }

    @Override
    public List<Pais> evaluarCondiciones(List<Pais> paises) {
        IFiltro filtros = new FiltroPoblacionMayorA(this.nacionalidad.getPoblacion()).and(new FiltroIdioma(this.idiomas));
        return paises.stream().filter(p -> filtros.aplicar(p)).toList();
    }
}
