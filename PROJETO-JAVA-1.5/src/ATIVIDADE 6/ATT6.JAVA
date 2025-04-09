/*                    EXERCICIO 6
Inspirado pela organização de um grande evento de networking, onde os participantes trocam
contatos e informações profissionais, um desenvolvedor decide criar um sistema para gerenciar
uma agenda de contatos. Este sistema ajudará os usuários a manter suas conexões organizadas,
permitindo-lhes adicionar, remover e buscar contatos facilmente.
Dica:
“Crie as classes Agenda e Contato em Java. A classe Contato deve armazenar informações como nome
e telefone, enquanto a classe Agenda deve gerenciar uma lista de contatos, com métodos para
adicionar novos contatos e buscar contatos por nome.” */


import java.util.ArrayList;

class Contato {
    String nome;
    String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}

class Agenda {
    private ArrayList<Contato> contatos; 

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        Contato novoContato = new Contato(nome, telefone);
        contatos.add(novoContato);
        System.out.println("Contato de " + nome + " adicionado com sucesso!");
    }

    public void buscarContato(String nome) {
        for (Contato c : contatos) {
            if (c.nome.equalsIgnoreCase(nome)) {
                c.exibirInformacoes();
                return;
            }
        }
        System.out.println("Contato " + nome + " não encontrado.");
    }
}

public class Main {
    public static void main(String[] args) {
       
        Agenda minhaAgenda = new Agenda();

        
        minhaAgenda.adicionarContato("João", "1234-5678");
        minhaAgenda.adicionarContato("Maria", "9876-5432");
        minhaAgenda.adicionarContato("Carlos", "2345-6789");

        
        System.out.println("\nBuscando contato de Maria:");
        minhaAgenda.buscarContato("Maria");

     
        System.out.println("\nBuscando contato de Pedro:");
        minhaAgenda.buscarContato("Pedro");
    }
}