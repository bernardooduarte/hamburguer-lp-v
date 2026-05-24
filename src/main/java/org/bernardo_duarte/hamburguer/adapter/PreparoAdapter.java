package org.bernardo_duarte.hamburguer.adapter;

public class PreparoAdapter extends PreparoTempo {
    private final IPreparo preparoPadrao;

    public PreparoAdapter(IPreparo preparoPadrao) {
        this.preparoPadrao = preparoPadrao;
    }

    public String recuperarPreparo() {
        if (this.getMinutos() >= 12.0f) {
            preparoPadrao.setPreparo("demorado");
        } else if (this.getMinutos() >= 8.0f) {
            preparoPadrao.setPreparo("medio");
        } else {
            preparoPadrao.setPreparo("rapido");
        }
        return preparoPadrao.getPreparo();
    }

    public void salvarPreparo() {
        if ("demorado".equals(preparoPadrao.getPreparo())) {
            this.setMinutos(12.0f);
        } else if ("medio".equals(preparoPadrao.getPreparo())) {
            this.setMinutos(8.0f);
        } else {
            this.setMinutos(5.0f);
        }
    }
}
