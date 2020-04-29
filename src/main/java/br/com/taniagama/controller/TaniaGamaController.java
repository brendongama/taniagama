package br.com.taniagama.controller;


import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.taniagama.model.Encomenda;
import br.com.taniagama.service.TaniagamaService;


@Controller
public class TaniaGamaController {
	
	@Autowired
	TaniagamaService taniagamaService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getForm() {
		return "encomendaForm";
	}

	@RequestMapping(value = "/encomendas", method = RequestMethod.GET)
	public ModelAndView getEncomendas() {
		ModelAndView mv = new ModelAndView("encomendas");
		List<Encomenda> encomendas = taniagamaService.findAll();
		mv.addObject("encomendas", encomendas);
		return mv;
	}
	
	@RequestMapping(value = "/newEncomenda", method = RequestMethod.GET)
	public String getEncomendaForm() {
		return "encomendaForm";
	}
	
	@RequestMapping(value = "/newEncomenda", method = RequestMethod.POST)
	public String saveEncomenda(@Valid Encomenda encomenda, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos");
			return "redirect:/newEncomenda";			
		}
		encomenda.setDataPedido(LocalDate.now());
		taniagamaService.save(encomenda);
		return "redirect:/encomendas";
	}
}
