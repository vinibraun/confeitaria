package br.edu.utfpr.confeitaria.model;

import lombok.*;

import javax.persistence.*;

import java.math.BigDecimal;

import static javax.persistence.GenerationType.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tamanho extends Model{

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(unique = true)
    private String tamanho; //p, m, g

    @Column(precision = 2)
    private BigDecimal peso; //peso (em kg) por tamanho

}
