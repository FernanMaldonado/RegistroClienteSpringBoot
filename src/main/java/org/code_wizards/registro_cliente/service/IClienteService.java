package org.code_wizards.registro_cliente.service;
import org.code_wizards.registro_cliente.entity.cliente;
import java.util.List;

public interface IClienteService {
    public List<cliente> listarClientes();

    public cliente buscarClienteporId(Integer codigo);

    public void guardarCliente(cliente cliente);//agregar y actuc

    public void eliminarCliente(cliente cliente);
}