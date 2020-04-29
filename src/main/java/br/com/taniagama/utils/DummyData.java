package br.com.taniagama.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.taniagama.model.Encomenda;
import br.com.taniagama.repository.TaniaGamaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

@Component
public class DummyData {

    @Autowired
    TaniaGamaRepository taniagamaRepository;

    // @PostConstruct
    public void savePosts(){

        List<Encomenda> postList = new ArrayList<>();
        Encomenda post1 = new Encomenda();
        post1.setDataEntrega("15/05/2020");
        post1.setHoraEntrega("14:00");
        post1.setDataPedido(LocalDate.now());
        post1.setDescricaoEncomenda("Bolo tal, com chocolate");
        post1.setNomeCliente("Brendon Alex");
        post1.setTema("Batman");
        post1.setValor(new BigDecimal("130"));
        post1.setTelefone("1198147-7212");
        post1.setEndereco("Rua mulungu n70"); 
        
        Encomenda post2 = new Encomenda();
        post2.setDataEntrega("09/06/2020");
        post2.setHoraEntrega("16:00");
        post2.setDataPedido(LocalDate.now());
        post2.setDescricaoEncomenda("Bolo de abacaxi");
        post2.setNomeCliente("Roberto Robson");
        post2.setTema("Batman");
        post2.setValor(new BigDecimal("150"));
        post2.setTelefone("1198147-0000");
        post2.setEndereco("Rua rio branco n80");
        
        
        postList.add(post1);
        postList.add(post2);
 

        for(Encomenda post: postList){
            Encomenda postSaved = taniagamaRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
