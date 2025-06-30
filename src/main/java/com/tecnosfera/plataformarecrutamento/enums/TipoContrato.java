package com.tecnosfera.plataformarecrutamento.enums;

public enum TipoContrato {

    CLT("Clt"),
    PJ("PJ"),
    ESTAGIO("Estágio"),
    TEMPORARIO("Temporário");

    private String descricao;

    TipoContrato(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
