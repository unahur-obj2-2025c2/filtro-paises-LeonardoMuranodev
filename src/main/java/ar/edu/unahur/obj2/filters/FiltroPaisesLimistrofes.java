package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPaisesLimistrofes extends Filtro{

    private Pais paisAQueDebeSerLimistrofe;

    public FiltroPaisesLimistrofes(Pais paisAQueDebeSerLimistrofe) {
        this.paisAQueDebeSerLimistrofe = paisAQueDebeSerLimistrofe;
    }

    @Override
    public Boolean aplicar(Pais pais) {
        return paisAQueDebeSerLimistrofe.getLimites().contains(pais);
    }
    
}
