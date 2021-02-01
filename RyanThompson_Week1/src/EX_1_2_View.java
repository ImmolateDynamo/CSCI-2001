import javax.swing.*; //Imports (IDE optimized)
import java.awt.*;

public class EX_1_2_View extends JFrame { //View program for EX_1_2
    //Declared Components for the GUI
    private JLabel label, output, output2, output3; //Label is utilized for the GUI instructions, while outputs are reserved for user input
    private JTextField first, last, email, home; //Text fields for the user info
    private JButton submit; //Submission button

    public EX_1_2_View() { //Empty Constructor to create the Java GUI from the instantiated components.
        setTitle("Basic Info GUI");
        setLayout(new FlowLayout());
        setSize(500, 300); //Fixed height and width established in declarations
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel(); //Instantiation
        addComponents(); //Adds components here

        //pack(); was included but after experimentation didn't yield desirable results for the formatting of the GUI box. Implemented a fixed size to height and width to clarify the fields better with the limited time to work on this project.
        setVisible(true);
    }
    //Instantiate Components for the GUI
    private void buildPanel() {
        label = new JLabel("Enter your first and last name, your email, and your home address."); //Prompts user and identifies sequence for text field inputs
        first = new JTextField(10); //Text fields of varying sizes to better align with the GUI scaling
        last = new JTextField(10);
        email = new JTextField(20);
        home = new JTextField(34);
        submit = new JButton("Submit"); //Button has action listener implemented in Control program
        output = new JLabel("Your name will appear here. "); //Outputs 1 through 3 are overridden by the commands in the Control program to become what the user input into the boxes
        output2 = new JLabel("Your email will appear here. ");
        output3 = new JLabel("Your address will appear here. ");
    }
    //Add components to the GUI
    private void addComponents() {
        add(label);
        add(first);
        add(last);
        add(email);
        add(home);
        add(submit);
        add(output);
        add(output2);
        add(output3);
    }
    //Getters for the text fields, the outputs and the submit button to be utilized by the Control and Model programs to assign variables
    public JLabel getOutput() {
        return output;
    }

    public JLabel getOutput2() {
        return output2;
    }

    public JLabel getOutput3() {
        return output3;
    }

    public JTextField getFirst() {
        return first;
    }

    public JTextField getLast() {
        return last;
    }

    public JTextField getEmail() {
        return email;
    }

    public JTextField getHome() {
        return home;
    }

    public JButton getSubmit() {
        return submit;
    }
}

