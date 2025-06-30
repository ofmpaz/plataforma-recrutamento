package com.tecnosfera.plataformarecrutamento.dto;

import com.tecnosfera.plataformarecrutamento.enums.Senioridade;

public record CandidatoResponseDTO(
        Long id,
        String cidade,
        String estado,
        String pais,
        Senioridade senioridade
) {}
