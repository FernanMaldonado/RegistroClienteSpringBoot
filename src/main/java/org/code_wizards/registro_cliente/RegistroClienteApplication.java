package org.code_wizards.registro_cliente;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class RegistroClienteApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(RegistroClienteApplication.class);

    String salto = System.lineSeparator();
    // ANtes de iniciar y al finalizar
    public static void main(String[] args) {
        logger.info("Inicando Aplicacion");
        SpringApplication.run(RegistroClienteApplication.class, args);
        logger.info("Finalizando la Aplicacion");
    }

    @Override
    public void run(String... args) throws Exception {

        registroClienteApp();
    }

    private void registroClienteApp(){
        logger.info(" +++ Bienvenido ajajajajajajaja");
        var salir = false ;
        var consola = new Scanner(System.in);
        while (!salir){
            var opcion = mostrarMenu(consola);
            salir = ejecutarOpciones(consola, opcion);
            logger.info(salto);
        }
    }

    private int mostrarMenu(Scanner consola){
        logger.info("""
				***Aplicacion
				1 listar
				2 Buscar
				3 Agregar
				4 Actualizar
				5 Eliminar
				6 salir
				""");

        var opcion = Integer.parseInt(consola.nextLine());
        return opcion;
    }

    private boolean ejecutarOpciones(Scanner consola,int opcion){
        return false ;
    }
}
