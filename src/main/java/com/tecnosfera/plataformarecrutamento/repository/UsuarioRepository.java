package com.tecnosfera.plataformarecrutamento.repository;

import com.tecnosfera.plataformarecrutamento.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
