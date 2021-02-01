import java.awt.event.ActionEvent; // IDE Consolidated imports for ActionListener
import java.awt.event.ActionListener;

public class EX_1_2_Control implements ActionListener //Control method for the EX_1_2 program. Passes View and Model through and implements an Action Listener for the Submit button present in the Java GUI created in View
{
    private EX_1_2_View v;
    private EX_1_2_Model m;

     public EX_1_2_Control(EX_1_2_View v, EX_1_2_Model m){ //Constructor for the Control program
         this.v=v;
         this.m=m;
         v.getSubmit().addActionListener(this); //Action Listener
     }
     @Override //Sets the input variables in the Model to the text values taken from the text fields generated for the Java GUI in View
     public void actionPerformed(ActionEvent e){
         m.setInput(v.getFirst().getText());
         m.setInput2(v.getLast().getText());
         m.setInput3(v.getEmail().getText());
         m.setInput4(v.getHome().getText());
        //Getters and Setters then amend the JLabels present in that same Java GUI to the users desired input, and describes what they were based on what was entered into the respective text boxes
         v.getOutput().setText("Your name is " + m.getInput() + m.getInput2() + ".");
         v.getOutput2().setText("Your email is " + m.getInput3() + ".");
         v.getOutput3().setText("Your address is " + m.getInput4() + ".");
    }
}
