package mx.unam.aragon.ico.is.formula1;

import mx.unam.aragon.ico.is.formula1.entities.Piloto;
import mx.unam.aragon.ico.is.formula1.repositories.PilotoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Formula1ApplicationTests {

    @Autowired
    private PilotoRepository pilotoRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void insertarPiloto() {
        Piloto piloto = new Piloto(null, "Checo Perez", "NO hay",
                "Fue bueno", 11, 35,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Oscar_Piastri.png/330px-Oscar_Piastri.png");

        pilotoRepository.save(piloto); // Hibernate genera el ID automáticamente
    }

    @Test
    void verPiloto() {
        Long idTmp = 1L;
        Piloto tmp = pilotoRepository.findPilotoById(idTmp);
        System.out.println(tmp);
    }

    @Test
    void eliminarPiloto() {
        Long idTmp = 1L;
        pilotoRepository.deleteById(idTmp);
    }

    @Test
    void actualizarPiloto() {
        Long idTmp = 2L;
        Piloto tmp = pilotoRepository.findPilotoById(idTmp);
        tmp.setNombre("Pato Oward");
        pilotoRepository.save(tmp);
    }
}
