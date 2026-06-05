package padrao;

public interface Subject {
    void adicionarSeguidor(Observer seguidor);
    void removerSeguidor(Observer seguidor);
    void notificarSeguidor();
}
