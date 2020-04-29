package br.com.taniagama.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taniagama.model.Encomenda;
import br.com.taniagama.repository.TaniaGamaRepository;
import br.com.taniagama.service.TaniagamaService;

@Service
public class TaniagamaServiceImpl implements TaniagamaService{
	
	@Autowired
	TaniaGamaRepository taniagamaRepository;

	@Override
	public List<Encomenda> findAll() {		
		return taniagamaRepository.findAll();
	}

	@Override
	public Encomenda findById(long id) {		
		return taniagamaRepository.findById(id).get();
	}

	@Override
	public Encomenda save(Encomenda encomenda) {		
		return taniagamaRepository.save(encomenda);
	}

}
