package pattern;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tico Santa Cruz", new PagamentoDinheiro());
        cliente1.realizarPagamento(100.0);
        System.out.println("-----------------------------");

        Cliente cliente2 = new Cliente("Fernando Badauí", new PagamentoPix());
        cliente2.realizarPagamento(150.0);
        System.out.println("-----------------------------");           
    }
}
