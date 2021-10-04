package br.com.doug.resources;

import br.com.doug.domain.Cliente;
import br.com.doug.services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {
   @Autowired
   private ClientesService clientesService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable int id) {
        Cliente cliente  = clientesService.buscar(id);

        return ResponseEntity.ok().body(cliente);

    }
}
