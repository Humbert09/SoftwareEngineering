package mx.unam.aragon.beis.beisbol.controllers;

import mx.unam.aragon.beis.beisbol.entities.Equipos;
import mx.unam.aragon.beis.beisbol.services.interfaces.BeisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/Beisbol")
public class RestController {
     @Autowired
    private BeisService beisService;

     @GetMapping("/")
     public ResponseEntity<Iterable<Equipos>> getEquipos() {
         //return BeisService.listar();
         //return  new ResponseEntity<>(BeisService.listar(), HttpStatus.CREATED);
         return ResponseEntity.ok().body(beisService.obtenerEquipos());

     }

    @GetMapping("/{id}")
    public ResponseEntity<Equipos> getEquipos(@PathVariable Long id) {
        //return BeisService.buscarPorId(id).orElse(null);
        return ResponseEntity.ok(beisService.buscarPorId(id).orElse(null));
    }

    @PostMapping("/")
    public Equipos createEquipos(@RequestBody Equipos equipos) {
        return beisService.crearEquipo(equipos);

     }
}
