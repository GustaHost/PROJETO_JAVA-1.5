/*Exercício 08
Uma pizzaria local busca modernizar seu processo de registro de pedidos, optando por desenvolver um sistema
em Java que ofereça praticidade e eficiência aos seus clientes e funcionários. O objetivo é criar uma solução
simples e acessível, capaz de armazenar detalhes fundamentais de cada pedido, como o tipo de pizza escolhida, o
tamanho desejado, o valor a ser pago e o endereço de entrega. Para atender a essa demanda, a empresa pretende
implementar uma classe Pedido, responsável por todas as operações relacionadas aos pedidos.
 Dentro da classe Pedido, os funcionários poderão adicionar novos pedidos ao sistema, fornecer detalhes
específicos sobre cada pedido, como sabor da pizza e endereço de entrega, além de ter a capacidade de cancelar
pedidos, se necessário. Além disso, o sistema será capaz de gerar um relatório completo de todos os pedidos
registrados, oferecendo insights valiosos, como o número total de pedidos realizados e a média de preço dos
pedidos. Essa abordagem integrada visa simplificar e otimizar o processo de registro e gerenciamento de pedidos,
contribuindo para uma experiência mais eficiente e satisfatória tanto para a pizzaria quanto para seus clientes.
Além disso, faça com que o sistema já tenha algumas pizzas cadastradas com nome para serem escolhidas em um
menu antes de adicionadas ao pedido. Desta forma, além da classe Pedido responsável por gerenciar os pedidos
realizados na pizzaria, cria uma classe Pizza que contenha o nome, valor e ingredientes de cada pizza a ser
escolhida em um pedido.
 Obs. os objetos “pizzas” da classe pizza podem ser criados e adicionados manualmente em uma lista pelo código
na main. Mas caso queira, é possível também fazer um menu para adicionar novos sabores além dos existentes. */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pizza {
    String nome;
    double valor;

    public Pizza(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome + " - R$" + valor;
    }
}

class Pedido {
    Pizza pizza;
    String endereco;

    public Pedido(Pizza pizza, String endereco) {
        this.pizza = pizza;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pizza: " + pizza.nome + ", Valor: R$" + pizza.valor + ", Endereço: " + endereco;
    }
}

public class SistemaPizzaria {
    public static void main(String[] args) {
        List<Pizza> pizzas = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        pizzas.add(new Pizza("Margherita", 25.00));
        pizzas.add(new Pizza("Pepperoni", 30.00));
        pizzas.add(new Pizza("Frango com Catupiry", 28.00));

        while (true) {
            // Menu
            System.out.println("\n1. Ver pizzas");
            System.out.println("2. Adicionar pedido");
            System.out.println("3. Cancelar último pedido");
            System.out.println("4. Relatório de pedidos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            if (opcao == 1) {
               
                System.out.println("\nPizzas disponíveis:");
                for (int i = 0; i < pizzas.size(); i++) {
                    System.out.println((i + 1) + ". " + pizzas.get(i));
                }
            } else if (opcao == 2) {
              
                System.out.println("\nEscolha uma pizza:");
                for (int i = 0; i < pizzas.size(); i++) {
                    System.out.println((i + 1) + ". " + pizzas.get(i).nome);
                }
                int escolhaPizza = scanner.nextInt() - 1;
                scanner.nextLine(); 

                if (escolhaPizza >= 0 && escolhaPizza < pizzas.size()) {
                    System.out.print("Informe o endereço de entrega: ");
                    String endereco = scanner.nextLine();
                    Pedido pedido = new Pedido(pizzas.get(escolhaPizza), endereco);
                    pedidos.add(pedido);
                    System.out.println("Pedido adicionado: " + pedido);
                } else {
                    System.out.println("Pizza inválida!");
                }
            } else if (opcao == 3) {
             
                if (!pedidos.isEmpty()) {
                    Pedido ultimoPedido = pedidos.remove(pedidos.size() - 1);
                    System.out.println("Pedido cancelado: " + ultimoPedido);
                } else {
                    System.out.println("Não há pedidos para cancelar!");
                }
            } else if (opcao == 4) {
                
                System.out.println("\nRelatório de Pedidos:");
                if (pedidos.isEmpty()) {
                    System.out.println("Não há pedidos registrados.");
                } else {
                    double total = 0;
                    for (Pedido pedido : pedidos) {
                        System.out.println(pedido);
                        total += pedido.pizza.valor;
                    }
                    double media = total / pedidos.size();
                    System.out.println("Número total de pedidos: " + pedidos.size());
                    System.out.println("Média do valor dos pedidos: R$" + media);
                }
            } else if (opcao == 5) {
               
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}