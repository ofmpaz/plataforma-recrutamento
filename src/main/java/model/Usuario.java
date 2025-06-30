package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Nome completo é obrigatório")
    @Size(min = 5, message = "Nome completo deve ter ao menos 5 caracteres")
    @Column(nullable=false)
    private String nomeCompleto;

    @NotNull(message = "Email é obrigatório")
    @Email(message = "Email inválido")
    @Column(nullable=false)
    private String email;

    @NotNull(message = "Telefone é obrigatório")
    @Pattern(regexp = "\\d{10,11}", message = "Telefone deve conter 10 ou 11 dígitos numéricos")
    @Column(nullable=false)
    private String telefone;

    @NotNull(message = "CPF é obrigatório")
    @Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$", message = "CPF deve estar no formato XXX.XXX.XXX-XX")
    @Column(nullable=false, unique=true)
    private String cpf;

    @NotNull(message = "Login é obrigatório")
    @Column(nullable=false)
    private String login;

    @NotNull(message = "Senha é obrigatória")
    @Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres")
    @Column(nullable=false)
    private String senha;
}
