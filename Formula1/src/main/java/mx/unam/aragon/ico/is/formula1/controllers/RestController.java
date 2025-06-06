package mx.unam.aragon.ico.is.formula1.controllers;

import mx.unam.aragon.ico.is.formula1.entities.Piloto;
import mx.unam.aragon.ico.is.formula1.services.interfaces.PilotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController


@RequestMapping("/API/Formula1")
public class RestController {

    @Autowired
    private PilotoService pilotoService;
    private PilotoService pilo;

    @GetMapping("/Paddock")
    public Iterable<Piloto> getPilotos() {
        return pilotoService.findAll();
    }

    @PostMapping("/Paddock")
    public Piloto createPiloto(@RequestBody Piloto piloto) {
        return pilotoService.create(piloto);
    }

    @GetMapping ("/Paddock/Piloto/{id}")
    public Piloto getPiloto(@PathVariable long id) {
        return pilotoService.findById(id).orElse(null);
    }
}
