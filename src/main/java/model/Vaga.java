package model;

import com.tecnosfera.plataformarecrutamento.enums.Senioridade;
import com.tecnosfera.plataformarecrutamento.enums.StatusVaga;
import com.tecnosfera.plataformarecrutamento.enums.TipoContrato;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TB_VAGAS")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String titulo;

    @NotNull
    @Column(nullable = false)
    private String descricao;

    @NotNull
    @Column(nullable = false)
    private String requisitos;

    @NotNull
    @Column(nullable = false)
    private LocalDate dataPublicacao;

    @NotNull
    @Column(nullable = false)
    private String local;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoContrato tipoContrato;

    @NotNull
    @Column(nullable = false)
    private String nomeEmpresa;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusVaga status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Senioridade senioridade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recrutador_id", nullable = false)
    private Recrutador recrutador;

}
