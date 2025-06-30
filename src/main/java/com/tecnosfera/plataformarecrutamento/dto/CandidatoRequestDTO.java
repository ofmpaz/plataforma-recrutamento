package com.tecnosfera.plataformarecrutamento.dto;

import com.tecnosfera.plataformarecrutamento.enums.Senioridade;

public record CandidatoRequestDTO(
        String cidade,
        String estado,
        String pais,
        Senioridade senioridade
) {}
