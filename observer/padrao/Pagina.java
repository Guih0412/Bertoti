package padrao;

import java.util.ArrayList;
import java.util.List;

public class Pagina implements Subject {
    private String nomePagina;
    private String post;
    private List<Observer> seguidores = new ArrayList<>();

    public Pagina(String nomePagina) {
        this.nomePagina = nomePagina;
    }

    public void publicarPost(String post) {
        this.post = post;
        notificarSeguidor();
    }

    @Override
    public void adicionarSeguidor(Observer seguidor) {
        seguidores.add(seguidor);
    }

    @Override
    public void removerSeguidor(Observer seguidor) {
        seguidores.remove(seguidor);
    }

    @Override
    public void notificarSeguidor() {
        System.out.println("Seguidores de " + nomePagina + " notificados");
        System.out.println("--------------------------------------------");
        for (Observer seguidor : seguidores) {
            seguidor.receberNotificacao(nomePagina, post);
        }
    }
}
