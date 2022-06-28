package br.edu.utfpr.confeitaria.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
public class ControleEstoque extends Model{

    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    @OneToOne
    private Ingrediente ingrediente;
    private LocalDateTime at;
    private Double quantidade;
}
