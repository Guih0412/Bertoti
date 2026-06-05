package pattern;

public class PagamentoBoleto implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via boleto: R$ " + valor);
    }
}