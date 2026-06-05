package antipadrao;

public class Main {
    public static void main(String[] args) {
        Seguidor seguidor1 = new Seguidor("emilyarmstrong");
        Seguidor seguidor2 = new Seguidor("mikeshinoda");
        Seguidor seguidor3 = new Seguidor("mrjoehhahn");
        Seguidor seguidor4 = new Seguidor("phoenixlp");
        Seguidor seguidor5 = new Seguidor("colinbrittain");
        Seguidor seguidor6 = new Seguidor("braddelson");

        Pagina pagina = new Pagina("linkinpark", seguidor1, seguidor2, seguidor3, seguidor4, seguidor5, seguidor6);

        pagina.publicarPost("Anúncio do filme 'Unshatter - the movie'");
    }
}