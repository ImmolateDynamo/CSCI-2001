//Ryan Thompson
//Exercise 2.27
//Model for retrieving the String input from the Control program and provide them for the output variable
public class EX_2_27_Model {
    private String line1, line2; //String variables for capture

    public EX_2_27_Model(String line1, String line2) { //Constructor
        this.line1 = line1;
        this.line2 = line2;
    }
    //Getters and Setters
    public String getLine1() {
        return line1;
    }
    public void setLine1(String line1) {
        this.line1 = line1;
    }
    public String getLine2() {
        return line2;
    }
    public void setLine2(String line2) {
        this.line2 = line2;
    }
}
