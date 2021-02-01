import javax.swing.*;
import java.awt.*;
//Ryan Thompson
//Exercise 2.27
//Java GUI to print the checkerboard to the GUI
public class EX_2_27_View extends JFrame { //Main method
    //Declaration of Components
    private JLabel input;
    private JTextArea output;
    private JButton submit;

    public EX_2_27_View() {
        setTitle("Checkerboard");
        setLayout(new BorderLayout()); //Border Layout for better visibility
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        buildPanel();
        addComponents();
        //pack();
        setVisible(true);
    }
    private void buildPanel() { //Instantiation
        input = new JLabel("Hit submit to generate a checkerboard design");
        output = new JTextArea();
        output.setLineWrap(true);
        submit = new JButton("Submit");
    }
    private void addComponents() { //Add Components
        add(input, BorderLayout.NORTH);
        add(output);
        add(submit, BorderLayout.SOUTH);
    }
    //Getters for the program
    public JTextArea getOutput() {
        return output;
    }
    public JButton getSubmit() {
        return submit;
    }
}
