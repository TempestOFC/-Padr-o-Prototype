public class ViolaoZero implements GuitarraPrototype {
    private String nome;
    private String tipoCorda;
    private String descricao;
    private double preco;
    
    public ViolaoZero() {
        this.nome = "Violão Zero";
        this.tipoCorda = "Nylon";
        this.descricao = "Parlor - menor tamanho, confortável para longas sessões";
        this.preco = 450.00;
    }
    
    @Override
    public GuitarraPrototype clonar() {
        try {
            return (GuitarraPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("=== " + nome + " ===");
        System.out.println("Tipo de corda: " + tipoCorda);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$ " + preco);
        System.out.println("------------------------");
    }
    
    @Override
    public void setNome(String nome) { this.nome = nome; }
    
    @Override
    public String getNome() { return nome; }
}