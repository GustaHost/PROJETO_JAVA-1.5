/* *************************

Em um mundo cada vez mais digital, um grupo de amigos apaixonados por videogames percebe
uma oportunidade de combinar seus hobbies com a prática de programação. Eles decidem criar
um sistema para gerenciar perfis de jogadores em seus jogos favoritos, algo que permitiria
acompanhar o progresso, as conquistas e as estatísticas de cada jogador de forma personalizada
e automatizada.
Inspirado por esse projeto entre amigos, o desafio é desenvolver uma parte desse sistema de
gerenciamento de jogadores utilizando Java, com um foco especial na orientação a objetos. O
sistema deve permitir a criação de perfis de jogadores, armazenando informações como nome,
pontuação e nível. Além disso, deve ser possível atualizar a pontuação e o nível dos jogadores no
sistema. Dica:
“Crie a classe Jogador, que deverá conter atributos privados para o nome, pontuacao e nivel
do jogador. Inclua um construtor para inicializar esses atributos e métodos públicos para permitir
a manipulação segura dessas informações — por exemplo, métodos para aumentar a pontuação,
subir de nível e exibir as informações do jogador.”

************************** */

public class ATT4
{
	public static void main(String[] args) {
	    
	    
	    Jogador jogador1 = new Jogador("gustavo", 10.0f, 5);
		
		jogador1.aumentarPontuacao();
		
		jogador1.subirNivel();
		
		jogador1.exibirInfo();
		
		
		
	}
}