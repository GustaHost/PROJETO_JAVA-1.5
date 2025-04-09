/*Exercício 07
Um empreendedor que gerencia um mercado local percebe a necessidade de um sistema para gerenciar
o estoque de produtos em sua loja. Ele deseja desenvolver um programa em Java que seja capaz de
registrar informações sobre os produtos disponíveis, controlar as quantidades em estoque e fornecer
funcionalidades básicas de gerenciamento de estoque. O sistema proposto deve permitir que cada
produto seja identificado por seu nome, um código único, um preço e a quantidade em estoque.
 Os funcionários do mercado devem ser capazes de adicionar novos produtos ao estoque, atualizar as
informações de um produto existente e remover produtos do estoque quando necessário. Para facilitar
o gerenciamento do mercado, o sistema também deve ser capaz de gerar relatórios sobre o estoque
atual, incluindo informações como os produtos disponíveis, a quantidade em estoque e o valor total em
estoque.
Dica:
“Como já deve ter entendido com os últimos exercícios, aqui você pode criar uma classe Produto que contém
as informações sobre cada item do mercado, entre nome, código do produto, quantidade em estoque e preço.
Neste caso, não é necessário criar uma classe Mercado para gerenciar o estoque individual de cadas mercado
e pode-se utilizar a própria Main que faz o programa funcionar para isso.” */




import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    String codigo;
    double preco;
    int quantidade;

    public Produto(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

public class Mercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Mostrar Estoque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            if (opcao == 1) {
                // Adicionar Produto
                System.out.print("Digite o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o código do produto: ");
                String codigo = scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                System.out.print("Digite a quantidade em estoque: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer

                Produto produto = new Produto(nome, codigo, preco, quantidade);
                estoque.add(produto);
                System.out.println("Produto adicionado!");

            } else if (opcao == 2) {
               
                System.out.print("Digite o código do produto a ser removido: ");
                String codigoRemover = scanner.nextLine();
                boolean encontrado = false;
                for (Produto p : estoque) {
                    if (p.codigo.equals(codigoRemover)) {
                        estoque.remove(p);
                        System.out.println("Produto removido!");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Produto não encontrado!");
                }

            } else if (opcao == 3) {
               
                if (estoque.isEmpty()) {
                    System.out.println("Estoque vazio!");
                } else {
                    System.out.println("\nEstoque:");
                    for (Produto p : estoque) {
                        System.out.println("Nome: " + p.nome + ", Código: " + p.codigo + ", Preço: R$ " + p.preco + ", Quantidade: " + p.quantidade);
                    }
                }

            } else if (opcao == 4) {
              
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}