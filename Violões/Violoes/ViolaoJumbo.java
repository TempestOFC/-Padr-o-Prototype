public class ViolaoJumbo implements GuitarraPrototype {
    private String nome;
    private String tipoCorda;
    private String descricao;
    private double preco;
    
    public ViolaoJumbo() {
        this.nome = "Violão Jumbo";
        this.tipoCorda = "Aço";
        this.descricao = "Corpo mais largo e base arredondada, som grave e encorpado";
        this.preco = 950.00;
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