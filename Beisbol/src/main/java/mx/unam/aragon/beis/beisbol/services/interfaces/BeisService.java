package mx.unam.aragon.beis.beisbol.services.interfaces;

import mx.unam.aragon.beis.beisbol.entities.Equipos;

import java.util.Optional;


public interface BeisService {
    public abstract Equipos crearEquipo(Equipos equipo);
    public abstract Iterable<Equipos> obtenerEquipos();
    public abstract Optional<Equipos> buscarPorId(Long clave);
    public abstract Equipos actualizar(Long clave, Equipos equipo);
    public abstract Equipos eliminar(Long clave);
}
