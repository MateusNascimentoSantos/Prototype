package pedido;

public class Pedido implements Cloneable {
    private int numero;
    private String cliente;
    private Endereco endereco;
    private String itens;
    private String observacao;

    public Pedido(int numero, String cliente, Endereco endereco, String itens, String observacao) {
        this.numero = numero;
        this.cliente = cliente;
        this.endereco = endereco;
        this.itens = itens;
        this.observacao = observacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public Pedido clone() throws CloneNotSupportedException {
        Pedido pedidoClone = (Pedido) super.clone();
        pedidoClone.endereco = (Endereco) pedidoClone.endereco.clone();
        return pedidoClone;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", endereco=" + endereco +
                ", itens='" + itens + '\'' +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
