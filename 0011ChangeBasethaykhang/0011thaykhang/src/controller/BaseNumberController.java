package controller;

import convert.BaseConverter;
import model.BaseType;
import validate.Validator;

public class BaseNumberController {

    private BaseType baseInput;
    private BaseType baseOutput;
    private String value = "";
    private String result = "";

    public void setBaseNumberInput(int choice) {
        this.baseInput = (choice == 1) ? BaseType.HEXADECIMAL : ((choice == 2) ? BaseType.DECIMAL : BaseType.BINARY);
    }

    public void setBaseNumberOutput(int choice) {
        this.baseOutput = (choice == 1) ? BaseType.HEXADECIMAL : ((choice == 2) ? BaseType.DECIMAL : BaseType.BINARY);
    }

    public void setInputValue() {
        this.value = Validator.inputValue("Enter value: ", baseInput);
    }

    public void convertBaseNumber() throws Exception {
        this.result = BaseConverter.convert(baseInput, baseOutput, value);
    }

    public void displayValue() {
        System.out.println(this.value + "(" + baseInput.getIntValue() + ") = " + result + "(" + baseOutput.getIntValue() + ")");
    }

}
