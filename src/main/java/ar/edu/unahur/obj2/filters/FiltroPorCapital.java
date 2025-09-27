package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPorCapital extends Filtro{

    private String prefijo;

    @Override
    public Boolean aplicar(Pais pais) {
        return pais.getCapital().startsWith(prefijo);
    }

}