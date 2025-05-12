package mx.unam.aragon.is.computadoraapi.controllers;

import mx.unam.aragon.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.is.computadoraapi.services.interfaces.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1/computadoras")
public class RestController {
    @Autowired
    private ComputadoraService computadoraService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Computadora>> getComputadoras() {
        //return computadoraService.listar();
        //return  new ResponseEntity<>(computadoraService.listar(), HttpStatus.CREATED);
        return ResponseEntity.ok().body(computadoraService.listar());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Computadora> getComputadora(@PathVariable Long id) {
        //return computadoraService.buscarPorId(id).orElse(null);
        return ResponseEntity.ok(computadoraService.buscarPorId(id).orElse(null));
    }

    @PostMapping("/")
    public Computadora createComputadora(@RequestBody Computadora computadora) {
        return computadoraService.crear(computadora);
    }


}
