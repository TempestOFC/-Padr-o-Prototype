public class ViolaoClassico implements GuitarraPrototype {
    private String nome;
    private String tipoCorda;
    private String descricao;
    private double preco;
    
    public ViolaoClassico() {
        this.nome = "Violão Clássico";
        this.tipoCorda = "Nylon";
        this.descricao = "Modelo acústico com seis cordas de nylon, indicado para iniciantes";
        this.preco = 350.00;
    }
    
    @Override
    public GuitarraPrototype clonar() {
        // Clonagem superficial
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