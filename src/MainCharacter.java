public class MainCharacter {
    private String nome;
    private double dano;
    private int vida;
    private char constanteKeyboard;
    private Projeteis[] projeteis = new Projeteis[3];
    public MainCharacter(String nome, double dano, int vida){
        this.nome = nome;
        this.dano = dano;
        this.vida = vida;
    }
    public void aumentaDano(){
        double amplifica = 0;
        for (int i = 0; i < projeteis.length ; i++) {
            if(projeteis[i] != null){
                amplifica = projeteis[i].getAmplificacaoDano() * this.dano;
            }
        }
        this.dano += amplifica;
    }
    public double Ataca(){
        return this.dano;
    }
    public void perdeHP(int dano){
        this.vida -= dano;
    }
    public void recuperaHP(int hp){
        this.vida += hp;
    }

    @Override
    public String toString(){
        return this.nome;
    }

}
