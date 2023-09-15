public class MainCharacter {
    private String nome;
    private int dano;
    private int vida;
    private char constanteKeyboard;

    public MainCharacter(String nome, int dano, int vida){
        this.nome = nome;
        this.dano = dano;
        this.vida = vida;
    }
    private Projeteis[] projeteis = new Projeteis[];

    public int Ataca(){
        return this.dano;
    }

    @Override
    public String toString(){
        return this.nome;
    }

}
