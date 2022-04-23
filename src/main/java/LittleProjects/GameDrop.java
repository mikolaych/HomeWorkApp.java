package LittleProjects;

import javax.swing.*;
import java.awt.*;

public class GameDrop extends JFrame {
    private  static GameDrop game_drop;

    public static void main(String[] args) {
        game_drop = new GameDrop();
        game_drop.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_drop.setLocation(200, 100);
        game_drop.setSize(906, 478);
        game_drop.setResizable(false);
        GameField game_field = new GameField();
        game_drop.add(game_field);
        game_drop.setVisible(true);
    }
    private static void onRepaint(Graphics g) {
        g.fillOval(10 ,10, 200, 100);
        g.drawLine(10, 120, 410, 120 );

    }
    private static class GameField extends JPanel {
        @Override
        protected void paintComponent (Graphics g) {
            super.paintComponent((g));
            onRepaint(g);

        }


    }
}
