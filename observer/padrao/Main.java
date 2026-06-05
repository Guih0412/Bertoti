package padrao;

public class Main {
    public static void main(String[] args) {
        Pagina pagina = new Pagina("mayk.leao");

        Seguidor seguidor1 = new Seguidor("guih__0412");
        Seguidor seguidor2 = new Seguidor("serjao.dos.foguetes");
        Seguidor seguidor3 = new Seguidor("luizbacci");

        pagina.adicionarSeguidor(seguidor1);
        pagina.adicionarSeguidor(seguidor2);
        pagina.adicionarSeguidor(seguidor3);

        pagina.publicarPost("Registro de ovni pousando em seu sítio no Paraná");
    }
}