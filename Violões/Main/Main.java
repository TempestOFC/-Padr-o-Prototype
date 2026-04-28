import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Registro de protótipos
        Map<String, GuitarraPrototype> prototipos = new HashMap<>();
        prototipos.put("classico", new ViolaoClassico());
        prototipos.put("folk", new ViolaoFolk());
        prototipos.put("flet", new ViolaoFlet());
        prototipos.put("jumbo", new ViolaoJumbo());
        prototipos.put("7cordas", new Violao7Cordas());
        prototipos.put("12cordas", new Violao12Cordas());
        prototipos.put("zero", new ViolaoZero());
        prototipos.put("duplozero", new ViolaoDuploZero());
        prototipos.put("triplozero", new ViolaoTriploZero());
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== FÁBRICA DE VIOLÕES - CLONAGEM SUPERFICIAL ===\n");
            System.out.println("Tipos disponíveis:");
            System.out.println("1 - Violão Clássico");
            System.out.println("2 - Violão Folk");
            System.out.println("3 - Violão Flat");
            System.out.println("4 - Violão Jumbo");
            System.out.println("5 - Violão 7 Cordas");
            System.out.println("6 - Violão 12 Cordas");
            System.out.println("7 - Violão Zero");
            System.out.println("8 - Violão Duplo Zero");
            System.out.println("9 - Violão Triplo Zero");
            
            System.out.print("\nEscolha um tipo (1-9): ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            String tipo = "";
            switch(opcao) {
                case 1: tipo = "classico"; break;
                case 2: tipo = "folk"; break;
                case 3: tipo = "flet"; break;
                case 4: tipo = "jumbo"; break;
                case 5: tipo = "7cordas"; break;
                case 6: tipo = "12cordas"; break;
                case 7: tipo = "zero"; break;
                case 8: tipo = "duplozero"; break;
                case 9: tipo = "triplozero"; break;
                default: System.out.println("Opção inválida!"); return;
            }
            
            // Clonagem do protótipo
            GuitarraPrototype violaoOriginal = prototipos.get(tipo);
            GuitarraPrototype violaoClonado = violaoOriginal.clonar();
            
            System.out.print("\nDigite um nome personalizado para seu violão: ");
            String nomePersonalizado = scanner.nextLine();
            violaoClonado.setNome(nomePersonalizado);
            
            System.out.println("\n--- Violão Original ---");
            violaoOriginal.exibirInfo();
            
            System.out.println("--- Violão Clonado ---");
            violaoClonado.exibirInfo();
        }
    }
}