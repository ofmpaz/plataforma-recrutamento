package com.tecnosfera.plataformarecrutamento.enums;

public enum StatusVaga {

    ABERTA("ABERTA"),
    EM_ROCESSO("EM PROCESSO"),
    ENCERRADA("ENCERRADA");

    private String descricao;

    StatusVaga(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
