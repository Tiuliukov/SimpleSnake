import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    private final int SIZE = 640;
    private final int ELEMENT_SIZE = 20;
    private final int MAX_ELEMENTS = 1024;
    private Image snakeDot;
    private Image food;
    private Image poison;
    private int foodX;
    private int foodY;
    private int[] x = new int[MAX_ELEMENTS];
    private int[] y = new int[MAX_ELEMENTS];
    private int snakeSize;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;


    public GameField(){
        setBackground(Color.black);
        loadImages();
    }

    public void loadImages(){
        ImageIcon imgSnake = new ImageIcon("snakeDot.png");
        snakeDot = imgSnake.getImage();
        ImageIcon imgFood = new ImageIcon("food.png");
        food = imgFood.getImage();
        ImageIcon imgPoison = new ImageIcon("poison.png");
        poison = imgPoison.getImage();
    }
}