package br.com.bravi.listaContatos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bravi.listaContatos.entity.Contato;
import br.com.bravi.listaContatos.entity.Pessoa;
import br.com.bravi.listaContatos.service.ContatoService;
import br.com.bravi.listaContatos.service.PessoaService;

@RestController
@RequestMapping(path = "/listaContato")
public class ListaContatosController {

	@Autowired
	private PessoaService pessoaService;

	@Autowired
	private ContatoService contatoService;

	@GetMapping("/pessoas")
	public List<Pessoa> listarPessoas() {
		return pessoaService.listarPessoas();
	}

	@GetMapping("/pessoa/{idPessoa}")
	public Pessoa obterPessoa(@PathVariable("idPessoa") Long idPessoa) {
		return pessoaService.obterPessoa(idPessoa);
	}

	@GetMapping("/contatos_pessoa/{idPessoa}")
	public List<Contato> listarContatos(@PathVariable("idPessoa") Long idPessoa) {
		return contatoService.listarContatosPessoa(idPessoa);
	}

	@PostMapping("/adicionar_pessoa")
	public void adicionarPessoa(@RequestBody Pessoa pessoa) {
		pessoaService.adicionarPessoa(pessoa);
	}
	
	@PutMapping("/editar_pessoa")
	public void editarPessoa(@RequestBody Pessoa pessoa) {
		pessoaService.editarPessoa(pessoa);
	}
	
	@DeleteMapping("/remover_pessoa/{idPessoa}")
	public void removerPessoa(@PathVariable("idPessoa") Long idPessoa) {
		pessoaService.removerPessoa(idPessoa);
	}

	@PostMapping("/adicionar_contato")
	public void adicionarContato(@RequestBody Contato contato) {
		contatoService.addContato(contato);
	}
	
	@PutMapping("/editar_contato")
	public void editarContato(@RequestBody Contato contato) {
		contatoService.editarContato(contato);
	}
	
	@DeleteMapping("/remover_contato/{idContato}")
	public void removerContato(@PathVariable("idContato") Long idContato) {
		contatoService.removerContato(idContato);
	}

}
