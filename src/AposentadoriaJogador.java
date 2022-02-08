public class AposentadoriaJogador {
    //atributos

    private String nome, posicao;
    private int datanasc;
    private int idade;
    

    
     public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //getters and setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public int getDatanasc() {
        return datanasc;
    }
    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }
    //metodo calcular idade
    public void idade() {
        setIdade((2022 - getDatanasc()));
   
    }

    //atributo imprimir dados jogador

        public void dados() {
            System.out.println("O jogador "+ this.getNome()+ " tem "+ this.getIdade() + " anos, e atua na posição de " + getPosicao());
           
        }

        //tempo para aposentadoria 

        public void aposentadoria() {
            int aposentadoria = 0;
            if (posicao == "Atacante") {
                aposentadoria = 35 - getIdade();
                System.out.println("Falta "+ aposentadoria + "anos para aposentadoria do jogador");
    
            } else if (posicao == "Meio-Campo") {
                aposentadoria = 38 - getIdade();
                System.out.println("Falta "+ aposentadoria + "anos para aposentadoria do jogador");
                
            }else if (posicao == "Defesa") {
                aposentadoria = 40 - getIdade();
                System.out.println("Falta "+ aposentadoria + "anos para aposentadoria do jogador");
        } else { System.out.println("Posição inválida");
        }
       

    
}
}
