package mx.unam.aragon.is.computadoraapi;

import mx.unam.aragon.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.is.computadoraapi.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraapiApplicationTests {
    @Autowired
    private ComputadoraRepository computadoraRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void insertarComputadora() {
        Computadora computadora = new Computadora(0, null, "HP", "Pavillion 2000", 13000.0f);
        computadoraRepository.save(computadora); //INSERT INTO
    }

}
