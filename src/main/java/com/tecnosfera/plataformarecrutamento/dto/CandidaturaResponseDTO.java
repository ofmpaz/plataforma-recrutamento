package com.tecnosfera.plataformarecrutamento.dto;

import com.tecnosfera.plataformarecrutamento.enums.StatusCandidatura;

import java.time.LocalDate;

public record CandidaturaResponseDTO(
        Long id,
        String nomeCandidato,
        String tituloVaga,
        LocalDate dataInscricao,
        StatusCandidatura status,
        String caminhoCurriculo
) {}
