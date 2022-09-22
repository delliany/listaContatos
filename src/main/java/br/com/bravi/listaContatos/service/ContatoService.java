package br.com.bravi.listaContatos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bravi.listaContatos.dto.ContatoDTO;
import br.com.bravi.listaContatos.entity.Contato;
import br.com.bravi.listaContatos.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository ContatoRepository;

	public List<Contato> listarContatosPessoa(Long id_pessoa) {
		List<ContatoDTO> listaContatoDTO = new ArrayList<>();
		List<Contato> listaContato = ContatoRepository.findAllByIdPessoa(id_pessoa);

		listaContato.forEach(item -> {
			ContatoDTO contatoDTO = new ContatoDTO(item.getId(), item.getPessoa(), item.getTelefone(), item.getEmail(),
					item.getWhatsapp());
			listaContatoDTO.add(contatoDTO);
		});

		return listaContato;
	}

	public void addContato(Contato contato) {
		ContatoRepository.save(contato);
	}

	public void editarContato(Contato contato) {
		ContatoRepository.save(contato);
	}
	
	public void removerContato(Long idContato) {
		ContatoRepository.deleteById(idContato);
	}
}
