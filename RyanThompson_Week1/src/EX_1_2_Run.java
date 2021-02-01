public class EX_1_2_Run //Utilize this program to run the Java GUI
    /*
    Running the program from this Run program opens the Java GUI and prompts the user to input the desired information into the text fields
    Upon hitting submit, the Action Listener in the Control program will take the text from the text fields and transfer them to the input variables established in the Model program using Setters and Getters from both Model and View
    The Java GUI will then use Getters to retrieve the information stored in those variables and override pre-made messages with the users information in three JLabels
    Program can be repeated indefinitely until it is closed
     */
{
    public static void main(String[] args) //Main method for the project, runs EX_1_2_View, EX_1_2_Model and EX_1_2_Control with the assigned arguments passed to them
    {
        EX_1_2_View view = new EX_1_2_View(); //View program
        EX_1_2_Model model = new EX_1_2_Model("","","",""); //Empty strings to represent the 4 input variable Strings present in the Model code
        EX_1_2_Control control = new EX_1_2_Control(view,model); //Control program allows passage of both View for the GUI and Model for the Setters and Getters for the text fields
    }
}
