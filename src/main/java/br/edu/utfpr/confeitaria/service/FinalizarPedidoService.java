package br.edu.utfpr.confeitaria.service;

import br.edu.utfpr.confeitaria.model.Bolo;
import br.edu.utfpr.confeitaria.model.PedidoBolo;
import br.edu.utfpr.confeitaria.service.CRUD.PedidoBoloService;

import java.math.BigDecimal;
public record FinalizarPedidoService(PedidoBoloService service, RemoverDoEstoqueService remover) {

    public BigDecimal closeOrder(PedidoBolo pedido) {
        service.save(pedido);
        remover.removeFromStock(pedido.getIngrediente());
        return pedido.getBolo().getValorTotal();
    }
}
