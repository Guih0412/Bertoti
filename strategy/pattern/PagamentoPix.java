package pattern;

public class PagamentoPix implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Pix: R$ " + valor);
    }
}