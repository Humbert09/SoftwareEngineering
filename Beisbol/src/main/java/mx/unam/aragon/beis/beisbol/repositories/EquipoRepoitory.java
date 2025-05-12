package mx.unam.aragon.beis.beisbol.repositories;

import mx.unam.aragon.beis.beisbol.entities.Equipos;
import org.springframework.data.repository.CrudRepository;

public interface EquipoRepoitory  extends CrudRepository<Equipos, Long> {
    public Equipos findByClave(int clave);
    public Equipos deleteByClave(Long clave);
}
