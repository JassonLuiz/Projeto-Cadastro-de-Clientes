package io.github.jassonluizjr.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.jassonluizjr.clientes.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
