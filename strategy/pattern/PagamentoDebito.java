package pattern;

public class PagamentoDebito implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento com cartão de débito: R$ " + valor);
    }
}