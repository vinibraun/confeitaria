package br.edu.utfpr.confeitaria.service;

import br.edu.utfpr.confeitaria.model.*;
import br.edu.utfpr.confeitaria.service.CRUD.BoloService;
import br.edu.utfpr.confeitaria.service.CRUD.PedidoBoloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public record CompraBoloService (PedidoBoloService pedidoBoloService,
                                 BoloService boloService){

    public PedidoBolo startNewBolo(Cliente cliente) {
        PedidoBolo pedidoBolo = new PedidoBolo(cliente);
        return pedidoBoloService.save(pedidoBolo);
    }

    public void addItemToOrder(MontaBolo montaBolo, PedidoBolo pedido, Bolo bolo, Sabor sabor, Categoria categoria) {
        log.info("Adicionando bolo de {} com sabor de {} ao pedido {}", bolo.getCategoria(), bolo.getSabor(), pedido.getId());
        pedido.getMontagemDoBolo().add(montaBolo.Montagem(sabor, categoria, pedido));
        pedidoBoloService.save(pedido);
    }

    public Bolo createOrderItem(PedidoBolo pedido, Bolo bolo, Sabor sabor, Categoria categoria) {
        Bolo boloPedido = Bolo.builder()
                .pedido(pedido)
                .sabor(sabor)
                .categoria(categoria)
                .build();
        boloService.save(boloPedido);
        return boloPedido;
    }
}
