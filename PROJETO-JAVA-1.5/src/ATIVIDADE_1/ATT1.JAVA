import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
		System.out.println("Informe o 1° numero para fazer sua operação: ");
		float num1 = leitor.nextFloat();
		
        leitor.nextLine();
		System.out.println("Informe uma operação logica para fazer sua conta (adição ,subtração ,multiplicação ou divisão): ");
		String operacao = leitor.nextLine();
		
		
		System.out.println("Informe o 2° numero para fazer sua operação: ");
		float num2 = leitor.nextFloat();
		
		switch(operacao){
		    case "adição": 
		        System.out.println("O resultado da sua operação é: " + (num1 + num2));
		        break;
		    case "subtração": 
		        System.out.println("O resultado da sua operação é: " + (num1 - num2));
		        break;
		    case "multiplicação": 
		        if(num1 == 0 || num2 == 0){
		            System.out.println("Não é possivel fazer multiplicação por 0! TENTE NOVAMENTE");
		        }else{
		            System.out.println("O resultado da sua operação é: " + (num1 * num2));
		        }
		        break;
		    case "divisão": 
		        System.out.println("O resultado da sua operação é: " + (num1 / num2));
		        break;
		    default: System.out.println("Informe uma operação valida !! TENTE NOVAMENTE !! ");
		        break;
		  
		}
	}
}