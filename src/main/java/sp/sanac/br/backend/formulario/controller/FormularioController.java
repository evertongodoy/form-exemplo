package sp.sanac.br.backend.formulario.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sp.sanac.br.backend.formulario.controller.request.FormularioRequest;

@RestController
@RequestMapping("/api/formulario")
public class FormularioController {

    @PostMapping
    public ResponseEntity<?> realizarReserva(@RequestBody final FormularioRequest request) {
        return ResponseEntity.ok().body("Numero " + request.getNumero() + " Nome " + request.getNome());
    }

}