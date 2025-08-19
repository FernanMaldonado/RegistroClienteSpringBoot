package org.code_wizards.registro_cliente.repository;
import org.code_wizards.registro_cliente.entity.cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository <cliente,Integer> {

}
