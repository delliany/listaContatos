package br.com.bravi.listaContatos.dto;

import br.com.bravi.listaContatos.entity.Pessoa;

public class ContatoDTO {

	private Long id;
	private Pessoa pessoa;
	private String telefone;
	private String email;
	private String whatsapp;

	public ContatoDTO(Long id, Pessoa pessoa, String telefone, String email, String whatsapp) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.telefone = telefone;
		this.email = email;
		this.whatsapp = whatsapp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
}
