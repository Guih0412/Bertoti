package padrao;

public class Seguidor implements Observer {
    private String nomeSeguidor;

    public Seguidor(String nomeSeguidor) {
        this.nomeSeguidor = nomeSeguidor;
    }

    @Override
    public void receberNotificacao(String nomePagina, String post) {
        System.out.println(nomeSeguidor + " recebeu notificação: " + nomePagina + " postou " + post);
        System.out.println(" ");
    }
}