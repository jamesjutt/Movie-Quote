/**
 * MovieQuote.java
 * James Jutt
 * 2/15/19
 * Graphical application that will display a movie quote. 
 * If the user wants to see which movie the quote came from, they will click the button, and the movie title will display.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MovieQuote extends JFrame implements ActionListener
{
    // Create the components 
    JFrame aFrame = new JFrame("Movie Quote");
    JLabel quote = new JLabel("I think we need a bigger boat");
    JLabel movie = new JLabel("*** JAWS (1975) ***");
    JButton button = new JButton("Show Movie");
    Font myFont = new Font("Comic Sans MS", Font.BOLD, 15);
    Color myColor = new Color(153, 50, 204);
    
    // Create a constructor for the JMovie class
    public JMovieQuote()
    {
        super("Movie quote");
        setSize(230, 130);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(quote);
        add(button);
        button.addActionListener(this);
        quote.setForeground(myColor);
        quote.setFont(myFont);
        button.setForeground(Color.BLACK);
        button.setBackground(myColor);
        setFont(myFont);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setResizable(false);
        setVisible(true);
    }

    // Event handling method
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        movie.setForeground(myColor);
        movie.setFont(myFont);
        add(movie);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        JMovieQuote myFrame = new JMovieQuote();
    }
}