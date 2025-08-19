package org.code_wizards.registro_cliente.service;
import org.code_wizards.registro_cliente.entity.cliente;
import org.code_wizards.registro_cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService implements IClienteService {

    @Override
    public List<cliente> listarClientes() {
        return List.of();
    }

    @Override
    public cliente buscarClienteporId(Integer codigo) {
        return null;
    }

    @Override
    public void guardarCliente(cliente cliente) {

    }

    @Override
    public void eliminarCliente(cliente cliente) {

    }
}
