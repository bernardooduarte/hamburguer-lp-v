package org.bernardo_duarte.hamburguer.adapter;

public class PreparoPadrao implements IPreparo {
    private String preparo;

    @Override
    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }

    @Override
    public String getPreparo() {
        return this.preparo;
    }
}
