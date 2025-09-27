package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroIdioma extends Filtro{
    private List<String> idiomas = new ArrayList<String>();

    public FiltroIdioma(String idioma) {
        this.idiomas.add(idioma);
    }

    public FiltroIdioma(List<String> idiomas) {
        this.idiomas.addAll(idiomas);
    }

    @Override
    public Boolean aplicar(Pais pais) {
        return this.idiomas.stream().anyMatch(i -> pais.getIdiomas().contains(i));
    }
}
