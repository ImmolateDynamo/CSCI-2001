import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Ryan Thompson
//Exercise 2.24
//Control Program for the Action Listener
public class EX_2_24_Control implements ActionListener{
    private EX_2_24_View v;
    private EX_2_24_Model m;

    public EX_2_24_Control(EX_2_24_View v, EX_2_24_Model m) { //Constructor for the Control program
        this.v=v;
        this.m=m;
        v.getSubmit().addActionListener(this); //Action Listener
    }
    @Override
    public void actionPerformed(ActionEvent e){ //Sets the num variables in the Model to the integer inputs from the 5 text fields in the GUI
        m.setNum1(Integer.parseInt(v.getField1().getText()));
        m.setNum2(Integer.parseInt(v.getField2().getText()));
        m.setNum3(Integer.parseInt(v.getField3().getText()));
        m.setNum4(Integer.parseInt(v.getField4().getText()));
        m.setNum5(Integer.parseInt(v.getField5().getText()));

        v.getOutput().setText("The smallest number is " + m.findSmall() + "."); //Amends the output to print the smallest and largest
        v.getOutput2().setText("The largest number is " + m.findLarge() + ".");
    }
}
