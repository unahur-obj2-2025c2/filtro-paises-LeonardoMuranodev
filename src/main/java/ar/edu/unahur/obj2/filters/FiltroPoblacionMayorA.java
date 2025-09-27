package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPoblacionMayorA extends Filtro {

    private Long poblacionASuperar;

    public FiltroPoblacionMayorA(Long poblacionASuperar) {
        this.poblacionASuperar = poblacionASuperar;
    }


    @Override
    public Boolean aplicar(Pais pais) {
        return pais.getPoblacion() > poblacionASuperar;
    }

}
