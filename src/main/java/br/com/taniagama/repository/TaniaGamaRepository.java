package br.com.taniagama.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.taniagama.model.Encomenda;

public interface TaniaGamaRepository extends JpaRepository<Encomenda, Long>{

}
