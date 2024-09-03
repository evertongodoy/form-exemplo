package sp.sanac.br.backend.formulario.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sp.sanac.br.backend.formulario.controller.request.FormularioRequest;

@RestController
@RequestMapping("/api/formulario")
public class FormularioController {

    @PostMapping
    public ResponseEntity<?> realizarReserva(final FormularioRequest request) {
        return ResponseEntity.ok().body("Numero " + request.getNumero() + " Nome " + request.getNome());
    }

}