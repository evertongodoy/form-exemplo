package sp.sanac.br.backend.Formulario.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/formulario")
public class FormularioController {

    @PostMapping
    public ResponseEntity<?> realizarReserva(){
        return ResponseEntity.ok().body("Reserva OK");
    }

}