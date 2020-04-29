package br.com.taniagama.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TB_ENCOMENDA")
public class Encomenda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyy")
	private LocalDate dataPedido;	
	
	@NotBlank
    private String dataEntrega;
    
	@NotBlank
    private String horaEntrega;
	
	@NotBlank
	private String tema; 
	
	private BigDecimal valor;
	
	@NotBlank
	private String nomeCliente;
	
	@NotBlank
	@Lob
	private String descricaoEncomenda;
	
	@NotBlank
	private String telefone;
	
	private String endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDescricaoEncomenda() {
		return descricaoEncomenda;
	}

	public void setDescricaoEncomenda(String descricaoEncomenda) {
		this.descricaoEncomenda = descricaoEncomenda;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getHoraEntrega() {
		return horaEntrega;
	}

	public void setHoraEntrega(String horaEntrega) {
		this.horaEntrega = horaEntrega;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
}
