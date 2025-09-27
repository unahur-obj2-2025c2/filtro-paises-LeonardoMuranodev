package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroEsIsla extends Filtro{

    @Override
    public Boolean aplicar(Pais pais) {
        return pais.esIsla();
    }

}
