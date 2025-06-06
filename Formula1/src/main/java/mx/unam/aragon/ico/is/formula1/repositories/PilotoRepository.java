package mx.unam.aragon.ico.is.formula1.repositories;

import jakarta.persistence.criteria.CriteriaBuilder;
import mx.unam.aragon.ico.is.formula1.entities.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PilotoRepository extends JpaRepository<Piloto, Integer> {

    public Piloto findPilotoById(Integer id);
    public Piloto deletePilotoById(Integer id);
}
