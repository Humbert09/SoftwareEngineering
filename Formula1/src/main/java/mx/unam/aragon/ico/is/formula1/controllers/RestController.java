package mx.unam.aragon.ico.is.formula1.controllers;

import jakarta.validation.Valid;
import mx.unam.aragon.ico.is.formula1.entities.Piloto;
import mx.unam.aragon.ico.is.formula1.services.interfaces.PilotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@org.springframework.web.bind.annotation.RestController


@RequestMapping("/API/Formula1")
public class RestController {

    @Autowired
    private PilotoService pilotoService;
    private PilotoService pilo;

    @GetMapping("/Paddock")
    public ResponseEntity<Iterable<Piloto>> getPilotos() {
        //return pilotoService.findAll();
        return new
                ResponseEntity<>(pilotoService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/Paddock")
    public  ResponseEntity<Piloto> createPiloto(@Valid @RequestBody Piloto piloto) {
        //return pilotoService.create(piloto);
        return new
                ResponseEntity<>(pilotoService.create(piloto), HttpStatus.CREATED);
    }

    @GetMapping ("/Paddock/Piloto/{id}")
    public ResponseEntity<Piloto> getPiloto(@PathVariable Integer id) {
        return ResponseEntity.accepted().body(pilotoService.findById(id).orElse(null));
    }

    @PutMapping("/Paddock/Piloto/{id}")
    public ResponseEntity<Piloto> updatePiloto(@PathVariable Integer id,
                                               @RequestBody Piloto piloto) {
        return ResponseEntity.accepted().body(pilotoService.update(id,piloto));
    }

    @PatchMapping("/Paddock/Piloto/{id}")
    public ResponseEntity<Piloto> patchComputadora(@PathVariable Integer id,
                                                   @RequestBody Piloto piloto) {
        Optional<Piloto> oldPiloto = pilotoService.findById(id);
        if (oldPiloto.isPresent()) {
            Piloto p = oldPiloto.get();
            if(piloto.getNombre() != null) p.setNombre(piloto.getNombre());
            if(piloto.getDescripcion() != null) p.setDescripcion(piloto.getDescripcion());
            if(piloto.getEdad() != null) p.setEdad(piloto.getEdad());
            if(piloto.getNumero() != null) p.setNumero(piloto.getNumero());
            if(piloto.getImagen() != null) p.setImagen(piloto.getImagen());
            if(piloto.getEquipo() != null) p.setEquipo(piloto.getEquipo());
            return ResponseEntity.ok(pilotoService.update(id, p));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/Paddock/Piloto/{id}")
    public ResponseEntity<Piloto> deletePiloto(@PathVariable Integer id) {
        return ResponseEntity.accepted().body(pilotoService.delete(id));
    }
}
