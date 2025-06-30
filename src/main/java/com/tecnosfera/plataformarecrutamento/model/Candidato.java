package com.tecnosfera.plataformarecrutamento.model;

import com.tecnosfera.plataformarecrutamento.enums.Senioridade;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_CANDIDATO")
public class Candidato extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Nome da cidade é obrigatório")
    @Column(nullable = false)
    private String cidade;

    @NotNull(message = "Nome da estado é obrigatório")
    @Column(nullable = false)
    private String estado;

    @NotNull(message = "Nome da país é obrigatório")
    @Column(nullable = false)
    private String pais;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Senioridade senioridade;
}
