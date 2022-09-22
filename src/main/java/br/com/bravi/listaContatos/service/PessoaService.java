package br.com.bravi.listaContatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bravi.listaContatos.entity.Pessoa;
import br.com.bravi.listaContatos.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	
	public List<Pessoa> listarPessoas() {
		return pessoaRepository.findAll();
	}

	public Pessoa obterPessoa(Long idPessoa) {
		return pessoaRepository.findById(idPessoa).get();
	}
	
	public void adicionarPessoa(Pessoa pessoa) {
		pessoaRepository.saveAndFlush(pessoa);
	}
	
	public void editarPessoa(Pessoa pessoa) {
		pessoaRepository.saveAndFlush(pessoa);
	}
	
	public void removerPessoa(Long idPessoa) {
		pessoaRepository.deleteById(idPessoa);
	}

}
