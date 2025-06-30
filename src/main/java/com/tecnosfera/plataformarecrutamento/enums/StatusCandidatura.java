package com.tecnosfera.plataformarecrutamento.enums;

public enum StatusCandidatura {
    APROVADO("Aprovado"),
    REPROVADO("Reprovado"),
    EM_AVALIACAO("Em avalição");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    StatusCandidatura(String descricao) {
        this.descricao = descricao;
    }
}
