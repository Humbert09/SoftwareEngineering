package mx.unam.aragon.is.computadoraapi.services.interfaces;

import mx.unam.aragon.is.computadoraapi.entities.Computadora;

import java.util.Optional;

public interface ComputadoraService {
    public abstract Computadora crear(Computadora computadora);
    public abstract Iterable<Computadora> listar();
    public abstract Optional<Computadora> buscarPorId(Long clave);
    public abstract Computadora actualizar(Long clave, Computadora computadora);
    public abstract Computadora eliminar(Long clave);
    //Requerimientos en caso de ser necesarios se declaran abajo
}
