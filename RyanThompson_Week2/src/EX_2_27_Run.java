//Ryan Thompson
//Exercise 2.27
//Main method for program
public class EX_2_27_Run {
    public static void main(String[] args) {
        EX_2_27_View view = new EX_2_27_View();
        EX_2_27_Model model = new EX_2_27_Model("", "");
        EX_2_27_Control control = new EX_2_27_Control(view, model);
    }
}
