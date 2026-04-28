public class ViolaoFolk implements GuitarraPrototype {
    private String nome;
    private String tipoCorda;
    private String descricao;
    private double preco;
    
    public ViolaoFolk() {
        this.nome = "Violão Folk";
        this.tipoCorda = "Aço";
        this.descricao = "Corpo maior e acinturado, indicado para pop e rock";
        this.preco = 750.00;
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