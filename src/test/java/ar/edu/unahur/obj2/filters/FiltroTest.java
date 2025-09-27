package ar.edu.unahur.obj2.filters;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.model.Pais;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;

public class FiltroTest {

    List<Pais> paises;

    @BeforeEach
    void setUp() {
        IPaisService paisService = new PaisService();
        paises = paisService.getPaises();
    }

    @Test
    void FiltroAreaMayorA() {
        IFiltro areaMayorAUnMillon = new FiltroAreaMayorA(10000000);
        List<Pais> paisesGrandes = paises.stream().filter(p -> areaMayorAUnMillon.aplicar(p)).toList();
        paisesGrandes.stream().forEach(p -> System.out.println(p.toString()));
    }

    @Test
    void FiltroPorIdioma() {
        IFiltro hablanEspañol = new FiltroIdioma("Spanish");
        List<Pais> hablanEnEspañol = paises.stream().filter(p -> hablanEspañol.aplicar(p)).toList();
        hablanEnEspañol.stream().forEach(p -> System.out.println(p.toString()));
    }

    @Test
    void FiltroPorIdiomaYPorAreaMayorA() {
        IFiltro enEspañolYAmplio = new FiltroAreaMayorA(1000000).and(new FiltroIdioma("Spanish"));
        
        List<Pais> hablanEnEspañolYAmplio = paises.stream().filter(p -> enEspañolYAmplio.aplicar(p)).toList();
        hablanEnEspañolYAmplio.stream().forEach(p -> System.out.println(p.toString()));
    }

    @Test
    void filtroExtenso() {
        IFiltro enInglesYMenosDe2000000YEsIsla = new FiltroPoblacionMenorA((long) 2000000.0).and(new FiltroIdioma("English")).or(new FiltroEsIsla());
        List<Pais> filtrados = paises.stream().filter(p -> enInglesYMenosDe2000000YEsIsla.aplicar(p)).toList();
        filtrados.stream().forEach(p -> System.out.println(p.toString()));
    }
    
}
