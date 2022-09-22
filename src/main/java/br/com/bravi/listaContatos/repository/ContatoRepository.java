package br.com.bravi.listaContatos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.bravi.listaContatos.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

	@Query("SELECT cont FROM Contato cont WHERE cont.pessoa.id = :idPessoa")
	List<Contato> findAllByIdPessoa(@Param("idPessoa") long idPessoa);
}
