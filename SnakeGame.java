import javax.swing.*;
public class SnakeGame extends JFrame{
    SnakeGame() {
        super("Snake Game");
        add(new Board());// call another class;/add methods use for another class code adding this page;
        pack(); // this is use for refers the frame;


        setSize(300,300);
        setLocationRelativeTo(null);//this is use for game play box in the screen middle;
         setVisible(true);// it is use for a frame for game;
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}
