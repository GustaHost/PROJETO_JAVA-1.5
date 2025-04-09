/*Em um mundo cada vez mais digital, um grupo de amigos apaixonados por videogames percebe
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
subir de nível e exibir as informações do jogador.”*/

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; 
    }

    public void acelerar() {
        this.velocidadeAtual += 10; 
        System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h");
    }

    public void frear() {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual -= 10; // A cada frenagem, o carro perde 10 km/h
        } else {
            System.out.println("O carro já está parado.");
        }
        System.out.println("Freando... Velocidade atual: " + this.velocidadeAtual + " km/h");
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Carro:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }


    public static void ATT5(String[] args) {
    
        Carro meuCarro = new Carro("Fusca", "Volkswagen", 1978, "ABC-1234");

        meuCarro.exibirInformacoes();

        meuCarro.acelerar();

        meuCarro.frear();

        meuCarro.exibirInformacoes();
    }
}
