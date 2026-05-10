package org.bernardo_duarte.hamburguer.builder;

import org.bernardo_duarte.hamburguer.domain.ItemCardapio;
import java.util.List;

/**
 * Produto - Hambúrguer personalizado construído pelo Builder
 */
public class HamburguerPersonalizado implements ItemCardapio {
    private String nomePao;
    private String tipoCarneCarrão;
    private List<String> vegetais;
    private List<String> queijos;
    private List<String> molhos;
    private List<String> complementos;
    private double preco;

    public HamburguerPersonalizado(ConstrutorHamburguer construtor) {
        this.nomePao = construtor.getNomePao();
        this.tipoCarneCarrão = construtor.getTipoCarneCarrão();
        this.vegetais = construtor.getVegetais();
        this.queijos = construtor.getQueijos();
        this.molhos = construtor.getMolhos();
        this.complementos = construtor.getComplementos();
        this.preco = construtor.getPreco();
    }

    @Override
    public String getNome() {
        return "Hambúrguer Personalizado com " + tipoCarneCarrão;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public String getDescricaoCompleta() {
        StringBuilder descricao = new StringBuilder();
        descricao.append("=== HAMBÚRGUER PERSONALIZADO ===\n");
        descricao.append("Pão: ").append(nomePao).append("\n");
        descricao.append("Carne: ").append(tipoCarneCarrão).append("\n");
        
        if (!vegetais.isEmpty()) {
            descricao.append("Vegetais: ").append(String.join(", ", vegetais)).append("\n");
        }
        
        if (!queijos.isEmpty()) {
            descricao.append("Queijos: ").append(String.join(", ", queijos)).append("\n");
        }
        
        if (!molhos.isEmpty()) {
            descricao.append("Molhos: ").append(String.join(", ", molhos)).append("\n");
        }
        
        if (!complementos.isEmpty()) {
            descricao.append("Complementos: ").append(String.join(", ", complementos)).append("\n");
        }
        
        descricao.append("Preço: R$ ").append(String.format("%.2f", preco));
        
        return descricao.toString();
    }

    public String getNomePao() {
        return nomePao;
    }

    public String getTipoCarneCarrão() {
        return tipoCarneCarrão;
    }

    public List<String> getVegetais() {
        return vegetais;
    }

    public List<String> getQueijos() {
        return queijos;
    }

    public List<String> getMolhos() {
        return molhos;
    }

    public List<String> getComplementos() {
        return complementos;
    }
}
