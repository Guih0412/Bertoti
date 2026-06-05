package antipattern;

public class Cliente {
    private String nome;
    private String formaPagamento;

    public Cliente(String nome, String formaPagamento) {
        this.nome = nome;
        this.formaPagamento = formaPagamento;
    }

    public void realizarPagamento(double valor) {
        System.out.println("Cliente: " + nome);
        if (formaPagamento.equals("dinheiro")) {
            System.out.println("Pagamento em dinheiro: R$ " + valor);

        } else if (formaPagamento.equals("pix")) {
            System.out.println("Pagamento via PIX: R$ " + valor);

        } else if (formaPagamento.equals("credito")) {
            System.out.println("Pagamento no cartão de crédito: R$ " + valor);

        } else if (formaPagamento.equals("debito")) {
            System.out.println("Pagamento no cartão de débito: R$ " + valor);

        } else if (formaPagamento.equals("boleto")) {
            System.out.println("Pagamento via boleto: R$ " + valor);

        } else {
            System.out.println("Forma de pagamento inválida.");
        }
    }
}