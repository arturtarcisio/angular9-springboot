package io.arturtcs.clientes.repositories;

import io.arturtcs.clientes.model.entities.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
