package com.tecnosfera.plataformarecrutamento.model;

import com.tecnosfera.plataformarecrutamento.enums.StatusCandidatura;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cantidatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "candidato_id")
    private Candidato candidato;

    @ManyToOne(optional = false)
    @JoinColumn(name = "vaga_id")
    private Vaga vaga;

    private LocalDate dataInscricao;

    @Enumerated(EnumType.STRING)
    private StatusCandidatura status;

    @Column(nullable = false)
    private String caminhoCurriculo;
}
