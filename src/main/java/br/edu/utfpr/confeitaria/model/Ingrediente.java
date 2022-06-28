package br.edu.utfpr.confeitaria.model;

import lombok.*;

import javax.persistence.*;

import java.math.BigDecimal;

import static javax.persistence.GenerationType.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente extends Model{

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Getter
    @Setter
    @Column(unique = true)
    private String nome;

    @Getter
    private Double quantidade;

    @Column(precision = 2)
    @Getter
    private BigDecimal valor; //valor por kg

    @ManyToOne
    @JoinColumn(name = "pedido_bolo_id")
    private PedidoBolo pedidoBolo;

    @ManyToOne @Getter
    private PedidoBolo ingredientesUsados;

    public PedidoBolo getPedidoBolo() {
        return pedidoBolo;
    }

    public void setPedidoBolo(PedidoBolo pedidoBolo) {
        this.pedidoBolo = pedidoBolo;
    }
}
