/*
Exercício 03
Em uma pequena cidade, um desenvolvedor entusiasta decide criar um sistema para ajudar a
gerenciar as contas bancárias dos cidadãos locais. Com o crescimento da comunidade, ficou
evidente a necessidade de um método mais eficiente e seguro para o manejo de transações
bancárias, que até então eram feitas manualmente e levavam muito tempo.
Inspirado por essa necessidade comunitária, o objetivo é desenvolver um sistema bancário
simples em Java, focando na orientação a objetos. Este sistema permitirá a criação de contas
bancárias, cada uma capaz de realizar operações básicas como depósitos, saques e consultas de
saldo. O desafio é estruturar o programa de forma que cada conta seja um objeto, refletindo os
princípios da programação orientada a objetos.
Dica:
“Projete uma classe ContaBancaria que encapsule os atributos de uma conta, como numeroConta,
nomeTitular e saldo. Utilize modificadores de acesso para garantir o encapsulamento e a segurança dos
dados. Implemente métodos para depositar(valor), sacar(valor) e um método que retorne o saldo atual da
conta. Lembre-se de que cada operação deve ajustar o saldo da conta de acordo com a transação realizada.”
*/
import java.util.Scanner;
public class ATT3{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
		ContaBancaria conta1 = new ContaBancaria(1111, "gustavo ribeiro", 2000);
		
		System.out.println("quer sacar algum valor ? (sim ou não)");
		String resposta = leitor.nextLine();
		if(resposta.equals("sim")){
		    conta1.sacarValor();
		}
		System.out.println("quer depositar algum valor ? (sim ou não)");
		resposta = leitor.nextLine();
		if(resposta.equals("sim")){
		    conta1.depositarValor();
		}
		
		System.out.println("quer saber o seu saldo ? (sim ou não)");
		resposta = leitor.nextLine();
		if(resposta.equals("sim")){
		    conta1.saldo();
		}
		
		
		
		//exemplo de como não pode ser mudado fora da pasta original pois é privada
		// System.out.println(conta1.saldo - 500);
		
		  
	}
}