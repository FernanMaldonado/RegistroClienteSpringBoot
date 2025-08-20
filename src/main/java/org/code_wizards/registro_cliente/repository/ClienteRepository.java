package org.code_wizards.registro_cliente.repository;
import org.code_wizards.registro_cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository <Cliente,Integer> {

}
