package org.bernardo_duarte.hamburguer.app;

import org.bernardo_duarte.hamburguer.abstractfactory.Combo;
import org.bernardo_duarte.hamburguer.abstractfactory.ComboFactory;
import org.bernardo_duarte.hamburguer.abstractfactory.ComboGourmetFactory;
import org.bernardo_duarte.hamburguer.bridge.CanalDelivery;
import org.bernardo_duarte.hamburguer.bridge.CanalVenda;
import org.bernardo_duarte.hamburguer.bridge.PedidoBridge;
import org.bernardo_duarte.hamburguer.bridge.PedidoExpress;
import org.bernardo_duarte.hamburguer.decorator.BaconDecorator;
import org.bernardo_duarte.hamburguer.decorator.HamburguerBaseAdapter;
import org.bernardo_duarte.hamburguer.decorator.HamburguerMontavel;
import org.bernardo_duarte.hamburguer.decorator.MolhoEspecialDecorator;
import org.bernardo_duarte.hamburguer.decorator.QueijoExtraDecorator;
import org.bernardo_duarte.hamburguer.singleton.PedidoIdGenerator;

public class HamburguerApplication {
    public static void main(String[] args) {
        ComboFactory comboFactory = new ComboGourmetFactory();
        Combo combo = Combo.criar(comboFactory);

        HamburguerMontavel hamburguerCustomizado = new HamburguerBaseAdapter(combo.getHamburguer());
        hamburguerCustomizado = new QueijoExtraDecorator(hamburguerCustomizado);
        hamburguerCustomizado = new BaconDecorator(hamburguerCustomizado);
        hamburguerCustomizado = new MolhoEspecialDecorator(hamburguerCustomizado);

        CanalVenda canal = new CanalDelivery();
        PedidoBridge pedido = new PedidoExpress(combo, canal, 6.0);

        int idPedido = PedidoIdGenerator.getInstance().proximoId();
        System.out.println("Pedido #" + idPedido);
        System.out.println("Combo: " + combo.descricao());
        System.out.println("Hamburguer customizado: " + hamburguerCustomizado.getDescricao());
        System.out.println("Preco hamburguer customizado: R$ " + hamburguerCustomizado.getPreco());
        System.out.println(pedido.fecharPedido());
    }
}
