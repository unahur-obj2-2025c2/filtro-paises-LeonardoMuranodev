package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPorNombre extends Filtro{
    private String prefijo;

    @Override
    public Boolean aplicar(Pais pais) {
        return pais.getNombre().startsWith(prefijo);
    }
}
