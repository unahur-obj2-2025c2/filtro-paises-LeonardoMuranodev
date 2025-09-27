package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;
import java.util.List;

public abstract class FiltroCompuesto implements IFiltro{
    protected List<IFiltro> filtros = new ArrayList<IFiltro>();

    @Override
    public IFiltro or(IFiltro filtro) {
        filtros.add(filtro);
        return this;
    }

    @Override
    public IFiltro and(IFiltro filtro) {
        filtros.add(filtro);
        return this;
    }
}
