public interface GuitarraPrototype extends Cloneable {
    GuitarraPrototype clonar();
    void exibirInfo();
    void setNome(String nome);
    String getNome();
}