package pedido;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveClonarPedidoSemAlterarOOriginal() throws CloneNotSupportedException {
        Pedido pedido = new Pedido(1001, "Maria", new Endereco("Rua Halfeld", 100, "Apto 201"), "1 Pizza Calabresa", "Sem cebola");

        Pedido pedidoClone = pedido.clone();
        pedidoClone.setNumero(1002);
        pedidoClone.getEndereco().setComplemento("Portaria");

        assertEquals("Pedido{numero=1001, cliente='Maria', endereco=Endereco{logradouro='Rua Halfeld', numero=100, complemento='Apto 201'}, itens='1 Pizza Calabresa', observacao='Sem cebola'}", pedido.toString());
        assertEquals("Pedido{numero=1002, cliente='Maria', endereco=Endereco{logradouro='Rua Halfeld', numero=100, complemento='Portaria'}, itens='1 Pizza Calabresa', observacao='Sem cebola'}", pedidoClone.toString());
    }

    @Test
    void deveClonarPedidoParaOutroEndereco() throws CloneNotSupportedException {
        Pedido pedido = new Pedido(1001, "Maria", new Endereco("Rua Halfeld", 100, "Apto 201"), "1 Pizza Calabresa", "Sem cebola");

        Pedido pedidoClone = pedido.clone();
        pedidoClone.setNumero(1003);
        pedidoClone.getEndereco().setLogradouro("Av. Rio Branco");
        pedidoClone.getEndereco().setNumero(2500);
        pedidoClone.setObservacao("Entregar no trabalho");

        assertEquals("Pedido{numero=1001, cliente='Maria', endereco=Endereco{logradouro='Rua Halfeld', numero=100, complemento='Apto 201'}, itens='1 Pizza Calabresa', observacao='Sem cebola'}", pedido.toString());
        assertEquals("Pedido{numero=1003, cliente='Maria', endereco=Endereco{logradouro='Av. Rio Branco', numero=2500, complemento='Apto 201'}, itens='1 Pizza Calabresa', observacao='Entregar no trabalho'}", pedidoClone.toString());
    }
}
