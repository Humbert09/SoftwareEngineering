package mx.unam.aragon.is.computadoraapi.repositories;

import mx.unam.aragon.is.computadoraapi.entities.Computadora;
import org.springframework.data.repository.CrudRepository;

public interface ComputadoraRepository extends CrudRepository<Computadora, Long> {

    public Computadora findComputadoraByClave(Long clave);
    public Computadora deleteComputadoraByClave(Long clave);
}
