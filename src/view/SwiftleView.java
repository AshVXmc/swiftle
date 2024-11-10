package view;

import model.Swiftle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwiftleView implements ActionListener {
    private Swiftle swiftle;
    private JFrame mainFrame;
    private BorderLayout borderLayout;
    private String defaultFont;

    // add more panels in the frame.
    public SwiftleView(String title, int width, int height) {
        borderLayout = new BorderLayout();
        mainFrame = new JFrame(title);
        defaultFont = "Calibri";

        // LAYOUT
        mainFrame.setSize(width, height);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        // // //

        // use jlabel setText to update text.

        mainFrame.add(createNorthPanel(), BorderLayout.NORTH);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JPanel createNorthPanel() {
        JPanel panel = new JPanel(borderLayout);

        JLabel header = new JLabel("<html><center>Swiftle</html>");
        header.setFont(new Font(defaultFont, Font.BOLD, 64));
        panel.add(header, BorderLayout.NORTH);

        JLabel subHeader = new JLabel("Guess the Taylor Swift song.");
        subHeader.setFont(new Font(defaultFont, Font.ITALIC, 32));
        panel.add(subHeader, BorderLayout.CENTER);

        JTextField answerTextField = new JTextField();
        // width doesn't matter cause borderlayout stretches it
        answerTextField.setFont(new Font(defaultFont, Font.PLAIN, 32));
        answerTextField.setPreferredSize(new Dimension(0,70));
        panel.add(answerTextField, BorderLayout.SOUTH);



        return panel;
    }



    private JPanel createCenterPanel() {
        JPanel panel = new JPanel(borderLayout);
        return panel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
