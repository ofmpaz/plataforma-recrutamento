package com.tecnosfera.plataformarecrutamento.repository;

import com.tecnosfera.plataformarecrutamento.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}
