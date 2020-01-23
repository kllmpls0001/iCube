import javax.swing.*;
import java.awt.*;

public class CubeWin extends JFrame {
    private Cube cube;
    CubeWin(Cube cube){
        this.cube = cube;
        this.setTitle("Cube");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        g.translate(300,300);
        g.drawLine(-300, 0, 300, 0);
        g.drawLine(0, -300, 0, 300);
        cube.draw(g);
    }
}