package pattern;

public class PagamentoCredito implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento com cartão de crédito: R$ " + valor);
    }
}