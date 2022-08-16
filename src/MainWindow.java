import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Simple Snake");
        setSize(640,665);
        setLocation(640,210);
        add(new GameField());
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
