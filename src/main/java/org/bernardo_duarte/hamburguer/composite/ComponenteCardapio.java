package org.bernardo_duarte.hamburguer.composite;

import org.bernardo_duarte.hamburguer.domain.ItemCardapio;

/**
 * Composite - Interface para componentes (folhas e compostos)
 */
public interface ComponenteCardapio extends ItemCardapio {
    void adicionarComponente(ComponenteCardapio componente);
    void removerComponente(ComponenteCardapio componente);
    void exibirDetalhes();
}
