package br.edu.utfpr.confeitaria.service;

import br.edu.utfpr.confeitaria.model.Bolo;
import br.edu.utfpr.confeitaria.model.ControleEstoque;
import br.edu.utfpr.confeitaria.model.Ingrediente;
import br.edu.utfpr.confeitaria.model.dto.ItemQuantityTO;
import br.edu.utfpr.confeitaria.repository.ControleEstoqueRepository;
import br.edu.utfpr.confeitaria.service.CRUD.EstoqueService;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
public record RemoverDoEstoqueService(ControleEstoqueRepository controleEstoqueRepository,
                                      EstoqueService estoqueService) {

    public void removeFromStock(List<Ingrediente> ingredientes){
        List<ItemQuantityTO> produtos = ingredientes
                .stream()
                .map(ingrediente -> new ItemQuantityTO(ingrediente, ingrediente.getQuantidade()))
                .toList();
        saveStockControl(produtos);
        updateStock(produtos);
    }

    private void updateStock(List<ItemQuantityTO> produtos) {
        produtos.stream()
                .map(produto -> ControleEstoque.builder()
                        .ingrediente(produto.getItem())
                        .quantidade(produto.getQuantity())
                        .at(LocalDateTime.now())
                        .build())
                .forEach(controleEstoqueRepository::save);
    }

    private void saveStockControl(List<ItemQuantityTO> products) {
        log.info("Editando estoque da lista [...]");
        products.stream()
                .map(product -> estoqueService.findFirstByItem(product.getItem())
                        .updateBy(product))
                .forEach(estoqueService::save);
        log.info("[...] estoque editado");
    }

}
