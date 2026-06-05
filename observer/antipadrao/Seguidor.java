package antipadrao;

public class Seguidor {
    private String nomeSeguidor;

    public Seguidor(String nomeSeguidor) {
        this.nomeSeguidor = nomeSeguidor;
    }

    public void notificar(String nomePagina, String post) {
        System.out.println(nomeSeguidor + " recebeu notificação: " + nomePagina + " postou " + post);
        System.out.println(" ");
    }
}
