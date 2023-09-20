public class Player {
    private String nomePlayer;
    private String pato;
    private Integer vidaPlayer;
    private Integer danoPlayer;

    public Player(Integer vidaPlayer, Integer danoPlayer) {
        this.nomePlayer = "Player 1";
        this.vidaPlayer = vidaPlayer;
        this.danoPlayer = danoPlayer;
        this.pato = "Quack";
    }

    public Integer getVidaPlayer(){
        return this.vidaPlayer;
    }

    public Integer getDanoPlayer(){
        return this.danoPlayer;
    }
    public String getPato(){
    return pato;
    }
}
