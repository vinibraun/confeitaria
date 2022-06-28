package br.edu.utfpr.confeitaria.model.dto;

import br.edu.utfpr.confeitaria.model.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class ItemQuantityTO {
    private Ingrediente item;
    private Double quantity;
}
