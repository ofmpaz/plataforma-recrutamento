package com.tecnosfera.plataformarecrutamento.enums;

public enum Senioridade {
    JUNIOR("Júnior"),
    PLENO("Pleno"),
    SENIOR("Sênior");

    private final String descricao;

    Senioridade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
