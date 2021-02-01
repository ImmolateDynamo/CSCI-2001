import javax.swing.*; //Import statements
import java.awt.*;
//Ryan Thompson
//Exercise 2.24
//Java GUI setup for the 2.24 Exercise
public class EX_2_24_View extends JFrame{
    //Declared Components for the GUI
    private JLabel input, output, output2;
    private JTextField field1, field2, field3, field4, field5;
    private JButton submit;

    public EX_2_24_View(){ //Constructor
        setTitle("Largest and Smallest");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Instantiation
        buildPanel();
        addComponents(); //Add Components

        pack();
        setVisible(true);
    }
    private void buildPanel(){ //Instantiate Components
        input = new JLabel("Enter 5 integers: ");
        field1 = new JTextField(5);
        field2 = new JTextField(5);
        field3 = new JTextField(5);
        field4 = new JTextField(5);
        field5 = new JTextField(5);
        submit = new JButton("Submit");
        output = new JLabel();
        output2 = new JLabel();
    }
    private void addComponents(){ //Add components to the GUI
        add(input);
        add(field1);
        add(field2);
        add(field3);
        add(field4);
        add(field5);
        add(submit);
        add(output);
        add(output2);
    }
    //Getters for the text fields, the outputs and the submit button to be utilized by the Control and Model programs to assign variables
    public JLabel getOutput() {
        return output;
    }

    public JLabel getOutput2(){ return output2; }

    public JTextField getField1() {
        return field1;
    }

    public JTextField getField2() {
        return field2;
    }

    public JTextField getField3() {
        return field3;
    }

    public JTextField getField4() {
        return field4;
    }

    public JTextField getField5() {
        return field5;
    }

    public JButton getSubmit() {
        return submit;
    }
}
