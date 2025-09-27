package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPoblacionMenorA extends Filtro {

    private Long poblacionASuperar;

    public FiltroPoblacionMenorA(Long poblacionASuperar) {
        this.poblacionASuperar = poblacionASuperar;
    }


    @Override
    public Boolean aplicar(Pais pais) {
        return pais.getPoblacion() < poblacionASuperar;
    }

}
