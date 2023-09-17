public class Player {
    private Integer vidaPlayer;
    private Integer danoPlayer;

    public Player(Integer vidaPlayer, Integer danoPlayer)
    {
        this.vidaPlayer = vidaPlayer;
        this.danoPlayer = danoPlayer;
    
    }

    public Integer getVidaPlayer(){
        return this.vidaPlayer;
    }

    public Integer getDanoPlayer(){
        return this.danoPlayer;
    }
        
    
}
