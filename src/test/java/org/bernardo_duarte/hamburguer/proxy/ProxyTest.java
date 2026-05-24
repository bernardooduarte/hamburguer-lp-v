package org.bernardo_duarte.hamburguer.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProxyTest {

    @BeforeEach
    void setUp() {
        BD.clear();
        BD.addHamburguer(new Hamburguer(1, "Burger Supremo", "Artesanal", "Molho da casa", "Queijo especial"));
        BD.addHamburguer(new Hamburguer(2, "Burger Classic", "Tradicional", "Tempero secreto", "Picles especial"));
    }

    @Test
    void deveRetornarDadosCardapioHamburguer() {
        HamburguerProxy hamburguer = new HamburguerProxy(1);

        assertEquals(Arrays.asList("Burger Supremo", "Artesanal"), hamburguer.obterDadosCardapio());
    }

    @Test
    void deveRetornarIngredientesSecretosHamburguer() {
        Funcionario funcionario = new Funcionario("Ana", true);
        HamburguerProxy hamburguer = new HamburguerProxy(2);

        assertEquals(Arrays.asList("Tempero secreto", "Picles especial"), hamburguer.obterIngredientesSecretos(funcionario));
    }

    @Test
    void deveRetornarExcecaoUsuarioNaoAutorizadoConsultarIngredientes() {
        Funcionario funcionario = new Funcionario("Joao", false);
        HamburguerProxy hamburguer = new HamburguerProxy(2);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> hamburguer.obterIngredientesSecretos(funcionario)
        );

        assertEquals("Funcionario nao autorizado", exception.getMessage());
    }
}
