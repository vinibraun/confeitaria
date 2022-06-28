package br.edu.utfpr.confeitaria.model;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sabor extends Model{

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Getter
    @Setter
    @Column(unique = true)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "ingredientes_id")
    private Ingrediente ingredientes;
}
