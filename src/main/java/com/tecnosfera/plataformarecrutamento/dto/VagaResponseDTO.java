package com.tecnosfera.plataformarecrutamento.dto;

import com.tecnosfera.plataformarecrutamento.enums.Senioridade;
import com.tecnosfera.plataformarecrutamento.enums.StatusVaga;
import com.tecnosfera.plataformarecrutamento.enums.TipoContrato;

public record VagaResponseDTO(
        Long id,
        String titulo,
        String descricao,
        String requisitos,
        String local,
        TipoContrato tipoContrato,
        String nomeEmpresa,
        StatusVaga status,
        Senioridade senioridade
) {}
