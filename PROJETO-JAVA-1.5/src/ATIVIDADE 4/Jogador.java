import java.util.Scanner;
public class Jogador{
    private String nome;
    private float pontuacao;
    private int nivel;
    
    Scanner leitor = new Scanner(System.in);
    
    public Jogador(String nome, float pontuacao, int nivel){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getPontuacao(){
        return pontuacao;
    }
    public void setPontuacao(float pontuacao){
        this.pontuacao = pontuacao;
    }
    
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    
    // métodos para aumentar a pontuação, subir de nível e exibir as informações do jogador.”
    
    
    void aumentarPontuacao(){
        System.out.println("Você quer aumentar sua pontuação? (sim ou não)");
        String resposta = leitor.nextLine();
        
        if(resposta.equals("sim")){
            System.out.println("Informe quanto voce ganhou de pontuação: ");
            float ganho = leitor.nextFloat();
            setPontuacao(pontuacao += ganho); 
        }
        if(resposta.equals("não")){
            System.out.println("Você aparentemente n tem pontuaçoes adicionais, volte quando tiver!");
        }
        if(!resposta.equals("não") && !resposta.equals("sim")){
            System.out.println("DIGITE UMA RESPOSTA VALIDA (sim ou não)");
        }
    }
        
    void subirNivel(){
        System.out.println("Você quer aumentar seu nivel? (sim ou não)");
        String resposta2 = leitor.nextLine();
        
            if(resposta2.equals("sim")){
            System.out.println("Você atingiu + que 1000 de pontuação?: (sim ou não)");
            String resposta3 = leitor.nextLine();
            
            if(resposta3.equals("sim")){
                setNivel(nivel += 1);
                System.out.println("seu nivel atual é de: " + getNivel());
            }
            
            if(resposta3.equals("não")){
                System.out.println("Você ira manter o mesmo nivel, !! volte quando tiver + de 1000 de pontuação !!");
            }
            
            if(!resposta3.equals("não") && !resposta2.equals("sim")){
                System.out.println("DIGITE UMA RESPOSTA VALIDA (sim ou não)");
            }
         
        }
        
        
        if(resposta2.equals("não")){
                System.out.println("Você ira manter o mesmo nivel, volte quando quiser aumentar!");
            }
            
        if(!resposta2.equals("não") && !resposta2.equals("sim")){
            System.out.println("DIGITE UMA RESPOSTA VALIDA (sim ou não)");
        }
    }
    
    
    
    
    
    
    void exibirInfo(){
        System.out.println("O nome do jogar é: " + getNome() + ".\nPontuação é de: " + getPontuacao() + " e falta " + (getPontuacao() - 1000) + " para subir de nivel. \nSeu nivel atual é de: " + getNivel());
    }
    

    
    
    
   
    
}