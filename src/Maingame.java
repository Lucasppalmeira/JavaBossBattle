public class Maingame {

    public static void main(String[] args) {
        
        //fazendo a tela aparecer
        Window window = new Window();

        //criando player
        Player player = new Player(100, 10);

        //criando boss
        Boss boss = new Boss("placeholder", 1000, 50);
        
    }
    
}
