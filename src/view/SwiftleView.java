package view;

import javax.swing.*;

public class SwiftleView extends JPanel {
    public void startNewGame() {
        JFrame frame = new JFrame("Swiftle");

        frame.setSize(600, 600);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }



}
