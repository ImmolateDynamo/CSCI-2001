//Ryan Thompson
//Exercise 2.24
//Main method for the 2.24 Java GUI. Run the program from here
public class EX_2_24_Run { //Main method
    public static void main(String[] args) {
        EX_2_24_View view = new EX_2_24_View();
        EX_2_24_Model model = new EX_2_24_Model();
        EX_2_24_Control control = new EX_2_24_Control(view, model);
    }
}
