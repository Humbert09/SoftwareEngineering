package mx.unam.aragon.ico.is.formula1.services.interfaces;

import mx.unam.aragon.ico.is.formula1.entities.Piloto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface PilotoService  {
    public abstract Piloto create(Piloto piloto);

    public abstract Iterable<Piloto> findAll();

    public abstract Optional<Piloto> findById(long id);

    public abstract Piloto update(Long id, Piloto piloto);

    public abstract Piloto delete(long id);
}

