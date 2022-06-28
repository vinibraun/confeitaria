package br.edu.utfpr.confeitaria.model;

import br.edu.utfpr.confeitaria.service.CompraBoloService;
import br.edu.utfpr.confeitaria.service.FinalizarPedidoService;
import br.edu.utfpr.confeitaria.service.RemoverDoEstoqueService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.GenerationType.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class MontaBolo extends Model{

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @OneToOne
    @Getter
    private Bolo bolo;

    @ManyToOne @Getter
    private PedidoBolo montagem;

    @OneToMany(mappedBy = "ingredientesUsados")
    @Getter
    private List<Ingrediente> ingrediente;

    public MontaBolo Montagem(Sabor sabor, Categoria categoria, PedidoBolo pedido) {
        log.info("Montando bolo de {} com sabor de {}", categoria, sabor);
        CompraBoloService compraBoloService = null;
        compraBoloService.createOrderItem(pedido, bolo, sabor, categoria);
        FinalizarPedidoService finalizar = null;
        finalizar.closeOrder(pedido);
        return null;
    }
}
