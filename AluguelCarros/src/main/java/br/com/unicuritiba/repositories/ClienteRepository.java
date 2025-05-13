package br.com.unicuritiba.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.models.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findAll();

}
