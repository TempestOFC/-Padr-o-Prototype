# 🎸 Fábrica de Violões - Padrão de Projeto Prototype

## 📋 Descrição do Projeto

Este projeto demonstra a aplicação prática do **Padrão de Projeto Prototype** (Creational Pattern) em Java, utilizando como cenário uma fábrica de violões que produz diferentes tipos de instrumentos musicais.

O padrão Prototype permite criar novos objetos clonando instâncias existentes (protótipos), evitando o custo de criação direta através do operador `new` e desacoplando o cliente das classes concretas.

## 🎯 Objetivo do Projeto

Implementar o padrão Prototype em duas variações:
- **Clonagem Superficial (Shallow Copy)** - Para 9 tipos diferentes de violões
- **Clonagem Profunda (Deep Copy)** - Demonstrando independência total entre objetos compostos

## 🎵 Tipos de Violões Implementados

| Tipo | Características | Cordas | Preço (R$) |
|------|----------------|--------|------------|
| **Clássico** | Modelo acústico, indicado para iniciantes | Nylon | 350,00 |
| **Folk** | Corpo maior e acinturado, para pop/rock | Aço | 750,00 |
| **Flat** | Caixa acústica fina, precisa de amplificação | Nylon | 1.200,00 |
| **Jumbo** | Corpo largo, som grave e encorpado | Aço | 950,00 |
| **7 Cordas** | Violão brasileiro para choro e samba | Nylon | 1.100,00 |
| **12 Cordas** | Dobro de cordas com ressonância plena | Aço | 1.350,00 |
| **Zero (Parlor)** | Menor tamanho, confortável | Nylon | 450,00 |
| **Duplo Zero (00)** | Tamanho médio-pequeno para fingerstyle | Nylon | 550,00 |
| **Triplo Zero (000)** | Tamanho intermediário, timbre peculiar | Nylon | 650,00 |

## 🏗️ Estrutura do Projeto

/
├── src/
│ ├── br/com/violao/prototype/
│ │ ├── GuitarraPrototype.java # Interface Prototype
│ │ └── CaracteristicasAdicionais.java # Para clonagem profunda
│ │
│ ├── br/com/violao/shallow/ # Clonagem Superficial
│ │ ├── ViolaoClassico.java
│ │ ├── ViolaoFolk.java
│ │ ├── ViolaoFlet.java
│ │ ├── ViolaoJumbo.java
│ │ ├── Violao7Cordas.java
│ │ ├── Violao12Cordas.java
│ │ ├── ViolaoZero.java
│ │ ├── ViolaoDuploZero.java
│ │ ├── ViolaoTriploZero.java
│ │ └── Main.java # Cliente superficial
│ │
│ └── br/com/violao/deep/ # Clonagem Profunda
│ ├── ViolaoClassicoDeep.java
│ └── MainDeep.java # Cliente profundo


## 🔧 Como Funciona o Padrão Prototype

### Interface Prototype
```java
public interface GuitarraPrototype extends Cloneable {
    GuitarraPrototype clonar();
    void exibirInfo();
    void setNome(String nome);
    String getNome();
}



CLONAGEM SUPERFICIAL


public GuitarraPrototype clonar() {
    try {
        return (GuitarraPrototype) super.clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
        return null;
    }
}


CLONAGEM PROFUNDA


public GuitarraPrototype clonar() {
    try {
        ViolaoClassicoDeep cloned = (ViolaoClassicoDeep) super.clone();
        cloned.caracteristicas = this.caracteristicas.clone(); // Deep copy
        return cloned;
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
        return null;
    }
}



📖 Conceitos Fundamentais
🔄 Clonagem Superficial (Shallow Copy)
Copia apenas as referências dos objetos internos

Original e cópia compartilham objetos internos

Mais rápida e usa menos memória

⚠️ Alterações em objetos internos afetam ambos

🔄 Clonagem Profunda (Deep Copy)
Copia todos os objetos internos recursivamente

Original e cópia completamente independentes

Mais segura para objetos mutáveis

⚠️ Mais lenta e usa mais memória

Quando Usar Cada Tipo?
Situação	Tipo Recomendado
Objetos com tipos primitivos/String	Superficial
Objetos imutáveis	Superficial
Objetos com referências mutáveis	Profunda
Quando precisa de independência total	Profunda
Performance crítica	Superficial



🎓 Aprendizados Chave
O padrão Prototype é ideal quando:

A criação de objetos é cara ou complexa

O sistema deve ser independente de como seus produtos são criados

As classes a instanciar são especificadas em tempo de execução




Vantagens do Padrão:

✅ Performance: Clonar é mais rápido que instanciar

✅ Desacoplamento: Cliente não conhece classes concretas

✅ Flexibilidade: Cria objetos dinamicamente

✅ Redução de custo: Evita repetir configurações




Cuidados ao Implementar:

⚠️ Cloneable é uma interface marcadora (sem métodos)

⚠️ Necessário tratar CloneNotSupportedException

⚠️ Em deep copy, todos os objetos aninhados devem ser clonáveis




🔍 Comparação Entre Abordagens
Característica	Superficial	Profunda
Velocidade	⚡ Muito rápida	🐢 Mais lenta
Independência	🔗 Parcial	🔒 Total
Uso de memória	💾 Baixo	💾💾 Alto
Complexidade	📄 Simples	📚 Complexa
Segurança	⚠️ Menos segura	✅ Mais segura




🛠️ Tecnologias Utilizadas
Java 11+

Programação Orientada a Objetos

Padrões de Projeto (Prototype)

Collections Framework (HashMap)

Interface Cloneable




📚 Referências
Design Patterns: Elements of Reusable Object-Oriented Software - Gang of Four

Documentação Java - Cloneable

Oracle Java Tutorials - Object Cloning




👨‍💻 Autor
Desenvolvido como projeto educacional para demonstração do Padrão de Projeto Prototype.



📄 Licença
Este projeto está sob a licença MIT - veja o arquivo LICENSE para detalhes.

===========================================================================================




