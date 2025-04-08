public class Biblioteca{
    String Titulo;
    String nomeAutor;
    int ano;
    //esse é o construtor que guarda o valor da variavel no objeto com o this. (não entendi mt bem mas creio que é isso)
     public Biblioteca(String Titulo, String nomeAutor, int ano) {
        this.Titulo = Titulo;
        this.nomeAutor = nomeAutor;
        this.ano = ano;
    }
    
    
    void exibirInfo(){
        System.out.println("O nome do autor do livro " + Titulo + " é " + nomeAutor + " escrito no ano de " + ano);
    }
}