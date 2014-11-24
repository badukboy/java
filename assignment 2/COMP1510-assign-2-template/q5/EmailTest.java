package q5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class EmailTest extends JFrame {
    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 20;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public EmailTest() {
        super("INSERT TITLE HERE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        setSize(350, 220); // you can change this size but don't make it HUGE!
        setVisible(true);
    }

    /**
     * <p>The main method.</p>
     */
    public static void main(String[] args) {
        new EmailTest();
    }

};
