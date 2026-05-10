package org.bernardo_duarte.hamburguer.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder - Classe para construir hambúrgueres complexos
 */
public class ConstrutorHamburguer {
    private String nomePao;
    private String tipoCarneCarrão;
    private List<String> vegetais;
    private List<String> queijos;
    private List<String> molhos;
    private List<String> complementos;
    private double preco;

    public ConstrutorHamburguer() {
        this.vegetais = new ArrayList<>();
        this.queijos = new ArrayList<>();
        this.molhos = new ArrayList<>();
        this.complementos = new ArrayList<>();
        this.preco = 25.00; // preço base
    }

    public ConstrutorHamburguer comPao(String nomePao) {
        this.nomePao = nomePao;
        return this;
    }

    public ConstrutorHamburguer comCarne(String tipoCarneCarrão) {
        this.tipoCarneCarrão = tipoCarneCarrão;
        return this;
    }

    public ConstrutorHamburguer adicionarVegetal(String vegetal) {
        this.vegetais.add(vegetal);
        return this;
    }

    public ConstrutorHamburguer adicionarQueijo(String queijo) {
        this.queijos.add(queijo);
        this.preco += 2.50;
        return this;
    }

    public ConstrutorHamburguer adicionarMolho(String molho) {
        this.molhos.add(molho);
        return this;
    }

    public ConstrutorHamburguer adicionarComplemento(String complemento) {
        this.complementos.add(complemento);
        this.preco += 3.00;
        return this;
    }

    public HamburguerPersonalizado construir() {
        if (nomePao == null || tipoCarneCarrão == null) {
            throw new IllegalStateException("Pão e carne são obrigatórios");
        }
        return new HamburguerPersonalizado(this);
    }

    // Getters para a classe HamburguerPersonalizado
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

    public double getPreco() {
        return preco;
    }
}
