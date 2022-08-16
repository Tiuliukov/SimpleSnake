import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameField extends JPanel implements ActionListener {
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
    private Timer timer;


    public GameField(){
        setBackground(Color.black);
        loadImages();
        initGame();
    }

    public void initGame(){
        snakeSize = 3;
        for (int i = 0; i < snakeSize; i++) {
            x[i] = 60 - i * ELEMENT_SIZE;
            y[i] = 60;
        }
        timer = new Timer(250,this);
        timer.start();
        createFood();
    }

    public void createFood(){
        foodX = new Random().nextInt(20)*ELEMENT_SIZE;
        foodY = new Random().nextInt(20)*ELEMENT_SIZE;
    }

    public void loadImages(){
        ImageIcon imgSnake = new ImageIcon("SnakeDot.png");
        snakeDot = imgSnake.getImage();
        ImageIcon imgFood = new ImageIcon("Food.png");
        food = imgFood.getImage();
        /* ImageIcon imgPoison = new ImageIcon("Poison.png");
        poison = imgPoison.getImage();
        */
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(inGame){
            g.drawImage(food,foodX,foodY,this);
            for (int i = 0; i < snakeSize; i++) {
                g.drawImage(snakeDot,x[i],y[i],this);
            }
        } else{
            String str = "Game Over";
            g.setColor(Color.white);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}