package org.bernardo_duarte.hamburguer.adapter;

public class Hamburguer {
    private final IPreparo preparo;
    private final PreparoAdapter persistencia;

    public Hamburguer() {
        preparo = new PreparoPadrao();
        persistencia = new PreparoAdapter(preparo);
    }

    public void setPreparo(String preparo) {
        this.preparo.setPreparo(preparo);
        persistencia.salvarPreparo();
    }

    public String getPreparo() {
        return persistencia.recuperarPreparo();
    }

    public float getTempoPreparo() {
        return persistencia.getMinutos();
    }
}
