import java.util.List;
import java.util.ArrayList;
import java.awt.event.*;

public class Player {
    private String nomePlayer;
    private String pato;
    private Integer vidaPlayer;
    private Integer danoPlayer;
    private int playerX;
    private int playerY;

    private List<Projeteis> projeteis;

    public Player(Integer vidaPlayer, Integer danoPlayer) {
        this.nomePlayer = "Player 1";
        this.vidaPlayer = vidaPlayer;
        this.danoPlayer = danoPlayer;
        this.pato = "Quack";

        projeteis = new ArrayList<>();
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

    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE){
            atirar();
        }
    }

    private void atirar() {
        Projeteis projetil = new Projeteis(playerX, playerY);
        projeteis.add(projetil);
    }

    
}
