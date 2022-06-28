package br.edu.utfpr.confeitaria.model;

import lombok.*;

import javax.persistence.*;

import java.math.BigDecimal;

import static javax.persistence.GenerationType.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Categoria extends Model {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(unique = true)
    private String categoria; //casual, aniversário, casamento, gourmet; o preço aumenta respectivamente

    @Column(precision = 2)
    private BigDecimal preco;

}
