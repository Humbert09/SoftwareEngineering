package mx.unam.aragon.beis.beisbol.services;

import mx.unam.aragon.beis.beisbol.entities.Equipos;
import mx.unam.aragon.beis.beisbol.repositories.EquipoRepoitory;
import mx.unam.aragon.beis.beisbol.services.interfaces.BeisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EquipoServiceImpl implements BeisService {

    @Autowired
    private EquipoRepoitory equipoRepoitory;


    @Override
    public Equipos crearEquipo(Equipos equipo) {
        return equipoRepoitory.save(equipo);
    }

    @Override
    public Iterable<Equipos> obtenerEquipos() {
        return equipoRepoitory.findAll();
    }

    @Override
    public Optional<Equipos> buscarPorId(Long clave) {
        return equipoRepoitory.findById(clave);
    }

    @Override
    public Equipos actualizar(Long clave, Equipos equipo) {
        Optional<Equipos> equipoActual = equipoRepoitory.findById(clave);
        if (equipoActual.isPresent()) {
            Equipos tmp = equipoActual.get();
            tmp.setNombre(equipo.getNombre());
            tmp.setClave(equipo.getClave());
            tmp.setLiga(equipo.getLiga());
            tmp.setLogo(equipo.getLogo());
            tmp.setCampeonatos(equipo.getCampeonatos());
            return equipoRepoitory.save(tmp);
        } else {
            return null;
        }
    }

    @Override
    public Equipos eliminar(Long clave) {
        return equipoRepoitory.deleteByClave(clave);
    }
}
