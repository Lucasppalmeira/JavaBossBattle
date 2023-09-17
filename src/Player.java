public class Player {
    private String pato;
    private Integer vidaPlayer;
    private Integer danoPlayer;

    public Player(Integer vidaPlayer, Integer danoPlayer)
    {
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
