
//exemplo com clonagem profunda
public class ViolaoClassicoDeep implements GuitarraPrototype {
    private String nome;
    private String tipoCorda;
    private String descricao;
    private double preco;
    private CaracteristicasAdicionais caracteristicas;
    
    public ViolaoClassicoDeep() {
        this.nome = "Violão Clássico";
        this.tipoCorda = "Nylon";
        this.descricao = "Modelo acústico com seis cordas de nylon";
        this.preco = 350.00;
        this.caracteristicas = new CaracteristicasAdicionais();
    }
    
    @Override
    public GuitarraPrototype clonar() {
        // Clonagem profunda
        try {
            ViolaoClassicoDeep cloned = (ViolaoClassicoDeep) super.clone();
            cloned.caracteristicas = this.caracteristicas.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void setCaracteristicas(CaracteristicasAdicionais caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    public CaracteristicasAdicionais getCaracteristicas() {
        return caracteristicas;
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("=== " + nome + " ===");
        System.out.println("Tipo de corda: " + tipoCorda);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$ " + preco);
        caracteristicas.exibirCaracteristicas();
        System.out.println("------------------------");
    }
    
    @Override
    public void setNome(String nome) { this.nome = nome; }
    
    @Override
    public String getNome() { return nome; }
}