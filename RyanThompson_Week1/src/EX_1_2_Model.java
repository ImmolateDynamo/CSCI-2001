public class EX_1_2_Model { //Model component of the MVC model. Contains the constructor, setters and getters for the input variables to be collected from the Java GUI text field created in EX_1_2_View.java
    private String input, input2, input3, input4; //Establishes input 1-4 as String variables
    public EX_1_2_Model(String input, String input2, String input3, String input4) { //Constructor generated from these variables
        this.input = input;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
    }
    //Setters and Getters generated through the IDE to be utilized in EX_1_2_Control to set the inputs to the text provided from the GUI text fields, and allow them to be retrieved by the View program for output
    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public String getInput2() {
        return input2;
    }
    public void setInput2(String input2) {
        this.input2 = input2;
    }
    public String getInput3() {
        return input3;
    }
    public void setInput3(String input3) {
        this.input3 = input3;
    }
    public String getInput4() {
        return input4;
    }
    public void setInput4(String input4) {
        this.input4 = input4;
    }
}
