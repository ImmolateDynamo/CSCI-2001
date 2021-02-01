import java.awt.event.ActionEvent; //Imports for Action Listener on JButton
import java.awt.event.ActionListener;
//Ryan Thompson
//Exercise 2.27
//Control for Action Listener and
public class EX_2_27_Control implements ActionListener {
    private EX_2_27_View v;
    private EX_2_27_Model m;

    public EX_2_27_Control(EX_2_27_View v, EX_2_27_Model m) { ///Constructor for Action Listener
        this.v=v;
        this.m=m;
        v.getSubmit().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) { //On event, button sends four copies of the two lines to the Model so that they can be reprinted in their alternating sequence
        m.setLine1("* * * * * * * *");
        m.setLine2(" * * * * * * * *");

        v.getOutput().setText(m.getLine1() + "\n" + m.getLine2() + "\n" + m.getLine1() + "\n" + m.getLine2() + "\n" + m.getLine1() + "\n" + m.getLine2() + "\n" + m.getLine1() + "\n" + m.getLine2() + "\n");
    }
}
