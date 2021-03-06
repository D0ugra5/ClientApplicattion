package br.com.doug.resources;

import br.com.doug.domain.Pedido;
import br.com.doug.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
   @Autowired
   private PedidoService pedidoService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable int id) {
        Pedido pedidos  = pedidoService.buscar(id);

        return ResponseEntity.ok().body(pedidos);

    }
}
