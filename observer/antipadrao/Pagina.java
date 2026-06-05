package antipadrao;

public class Pagina {

    private String nomePagina;

    private Seguidor seguidor1;
    private Seguidor seguidor2;
    private Seguidor seguidor3;
    private Seguidor seguidor4;
    private Seguidor seguidor5;
    private Seguidor seguidor6;

    public Pagina(String nome, Seguidor seguidor1, Seguidor seguidor2, Seguidor seguidor3, Seguidor seguidor4, Seguidor seguidor5, Seguidor seguidor6) {
        this.nomePagina = nome;
        this.seguidor1 = seguidor1;
        this.seguidor2 = seguidor2;
        this.seguidor3 = seguidor3;
        this.seguidor4 = seguidor4;
        this.seguidor5 = seguidor5;
        this.seguidor6 = seguidor6;
    }

    public void publicarPost(String video) {
        System.out.println("Seguidores de " + nomePagina + " notificados");
        System.out.println("--------------------------------------------");
        seguidor1.notificar(nomePagina, video);
        seguidor2.notificar(nomePagina, video);
        seguidor3.notificar(nomePagina, video);
        seguidor4.notificar(nomePagina, video);
        seguidor5.notificar(nomePagina, video);
        seguidor6.notificar(nomePagina, video);
    }
}
