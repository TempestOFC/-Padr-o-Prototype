import java.util.ArrayList;
import java.util.List;

public class CaracteristicasAdicionais implements Cloneable {
    private List<String> acessorios;
    private String madeira;
    private boolean temAmplificador;
    
    public CaracteristicasAdicionais() {
        this.acessorios = new ArrayList<>();
        this.madeira = "Cedro";
        this.temAmplificador = false;
    }
    
    public void adicionarAcessorio(String acessorio) {
        acessorios.add(acessorio);
    }
    
    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }
    
    public void setTemAmplificador(boolean temAmplificador) {
        this.temAmplificador = temAmplificador;
    }
    
    @Override
    public CaracteristicasAdicionais clone() {
        try {
            CaracteristicasAdicionais cloned = (CaracteristicasAdicionais) super.clone();
            // Clonagem profunda da lista
            cloned.acessorios = new ArrayList<>(this.acessorios);
            return cloned;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void exibirCaracteristicas() {
        System.out.println("Madeira: " + madeira);
        System.out.println("Amplificador: " + (temAmplificador ? "Sim" : "Não"));
        System.out.println("Acessórios: " + (acessorios.isEmpty() ? "Nenhum" : String.join(", ", acessorios)));
    }
}