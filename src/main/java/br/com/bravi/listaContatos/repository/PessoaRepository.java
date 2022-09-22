package br.com.bravi.listaContatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bravi.listaContatos.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
