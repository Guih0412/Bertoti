package pattern;

public class Cliente {
    private String nome;
    private FormaPagamento formaPagamento;

    public Cliente(String nome, FormaPagamento formaPagamento){
        this.nome = nome;
        this.formaPagamento = formaPagamento;
    }

    public void realizarPagamento(double valor){
        System.out.println("Cliente: " + nome);
        formaPagamento.pagar(valor);
    }
}