package ar.edu.unahur.obj2.viajeros;

import java.util.List;

import ar.edu.unahur.obj2.filters.*;
import ar.edu.unahur.obj2.model.Pais;

public class ViajeroPrimerizo extends Viajero{

    public ViajeroPrimerizo(Pais nacionalidad, List<String> idiomas) {
        super(nacionalidad, idiomas);
    }

    @Override
    public List<Pais> evaluarCondiciones(List<Pais> paises) {
        IFiltro filtros = new FiltroPaisesLimistrofes(nacionalidad).and(new FiltroIdioma(this.idiomas));
        IFiltro filtroIsla = new FiltroEsIsla();
        return paises.stream().filter(p -> filtros.aplicar(p) && !filtroIsla.aplicar(p)).toList();
    }

}
