package mx.unam.aragon.ico.is.formula1.services;

import jakarta.persistence.criteria.CriteriaBuilder;
import mx.unam.aragon.ico.is.formula1.entities.Piloto;
import mx.unam.aragon.ico.is.formula1.repositories.PilotoRepository;
import mx.unam.aragon.ico.is.formula1.services.interfaces.PilotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PilotoServiceImpl implements PilotoService {

    @Autowired
    private PilotoRepository pilotoRepository;

    @Override
    public Piloto create(Piloto piloto) {
        return pilotoRepository.save(piloto);
    }

    @Override
    public Iterable<Piloto> findAll() {
        return pilotoRepository.findAll();
    }

    @Override
    public Optional<Piloto> findById(Integer id) {
        return pilotoRepository.findById(id);
    }

    @Override
    public Piloto update(Integer id, Piloto piloto) {
        Optional<Piloto> oldPiloto =
                pilotoRepository.findById(id);
        if (oldPiloto.isPresent()) {
            Piloto p = oldPiloto.get();

            p.setNombre(piloto.getNombre());
            p.setDescripcion(piloto.getDescripcion());
            p.setEdad(piloto.getEdad());
            p.setEquipo(piloto.getEquipo());
            p.setImagen(piloto.getImagen());
            p.setNumero(piloto.getNumero());
            return pilotoRepository.save(p);
        } else {
            return null;
        }
    }

    @Override
    public Piloto delete(Integer id) {
        return null;
    }

}
