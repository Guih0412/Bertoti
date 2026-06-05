package antipattern;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Lamine Yamal","credito");
        cliente1.realizarPagamento(200.0);
        System.out.println("-----------------------------");

        Cliente cliente2 = new Cliente("Raphinha", "debito");
        cliente2.realizarPagamento(250.0);
        System.out.println("-----------------------------");

        Cliente cliente3 = new Cliente("Yuri Alberto", "boleto");
        cliente3.realizarPagamento(300.0);
        System.out.println("-----------------------------");
    }
}
