import java.awt.Graphics;
import java.awt.Image;

public class Projeteis {
    private int X;
    private int Y;
    private int velocityY;
    private Image imageProjetil;

    public Projeteis( int X, int Y){
        this.X = X;
        this.Y = Y;
        this.velocityY = -5;
    }

    public void move(){
        Y += velocityY;
    }

    public void draw(Graphics g){
    
        g.drawImage(imageProjetil, X, Y, null);
    }

    public boolean isOutOfScreen(){
        return Y < 0;
    }

}