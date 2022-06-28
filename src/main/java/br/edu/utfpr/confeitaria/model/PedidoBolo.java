package br.edu.utfpr.confeitaria.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.*;

@Entity
@NoArgsConstructor
public class PedidoBolo extends Model{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter
    private Long id;

    private LocalDateTime date;

    @OneToOne
    @Getter
    private Bolo bolo;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "ingredientesUsados")
    @Getter
    private List<Ingrediente> ingrediente;

    @OneToMany(mappedBy = "montagem")
    @Getter
    private List<MontaBolo> montagemDoBolo;

    @Getter
    private Double quantidade;

    public PedidoBolo(Cliente cliente) {
        this.cliente = cliente;
        this.date = LocalDateTime.now();
        this.bolo = bolo;
    }
}
