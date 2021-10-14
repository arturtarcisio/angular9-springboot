package io.arturtcs.clientes.repositories;

import io.arturtcs.clientes.model.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
