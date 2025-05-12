package mx.unam.aragon.beis.beisbol;

import mx.unam.aragon.beis.beisbol.entities.Equipos;
import mx.unam.aragon.beis.beisbol.repositories.EquipoRepoitory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeisbolApplicationTests {

    @Autowired
    private EquipoRepoitory equipoRepoitory;

    @Test
    void contextLoads() {
    }

    @Test
    void insertarEquipo() {
        Equipos equipo = new Equipos(0, "Yankees", "Americana", null, 27);
        equipoRepoitory.save(equipo); //Insert into
    }

}
