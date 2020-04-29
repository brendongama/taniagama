package br.com.taniagama.service;

import java.util.List;

import br.com.taniagama.model.Encomenda;

public interface TaniagamaService {
	
	List<Encomenda> findAll();
	Encomenda findById(long id);
	Encomenda save(Encomenda encomenda);

}
