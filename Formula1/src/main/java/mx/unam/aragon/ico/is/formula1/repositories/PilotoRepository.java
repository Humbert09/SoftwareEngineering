package mx.unam.aragon.ico.is.formula1.repositories;

import mx.unam.aragon.ico.is.formula1.entities.Piloto;
import org.springframework.data.repository.CrudRepository;

public interface PilotoRepository extends CrudRepository<Piloto, Long> {

    public Piloto findPilotoById(Long id);
    public Piloto deletePilotoById(Long id);
}
