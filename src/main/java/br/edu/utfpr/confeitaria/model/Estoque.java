package br.edu.utfpr.confeitaria.model;

import br.edu.utfpr.confeitaria.model.dto.ItemQuantityTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity @AllArgsConstructor @RequiredArgsConstructor @Builder
public class Estoque extends Model{

    @Id @GeneratedValue
    private Long id;
    @OneToOne @Getter //pq onetoone?
    private Ingrediente item;
    @OneToOne
    private Ingrediente ingrediente;
    private Double quantity;

    @LastModifiedDate
    private LocalDateTime lastModified;

    public Estoque updateBy(ItemQuantityTO to){
        this.quantity += to.getQuantity();
        return this;
    }
}
