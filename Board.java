import javax.swing.*;
import java.awt.*;
//panel is besically a component;
public class Board extends JPanel {

    private int dots;// this is for dots initialize ;

    Board() {
        setBackground(Color.BLACK);// this is use for background;
        setFocusable(true);// this is use for frame focus;
        loadImages();// this is for creating image
        initGame();// initilize the game;
    }
    public void initGame(){
        dots = 3;
        for(int i=0;i<dots;i++){

        }
    }


}
