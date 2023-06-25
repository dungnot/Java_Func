
import controller.BaseNumberController;
import validate.Validator;


public class Main {

    public static void main(String[] args) throws Exception {
        BaseNumberController baseNumberController = new BaseNumberController();
        int choice;
        while (true) {
           
            showListOfBaseNumber();
            
            
            choice = Validator.getInt("Choose the base number input: ", 1, 3);
            baseNumberController.setBaseNumberInput(choice);

            
            showListOfBaseNumber();
           
            choice = Validator.getInt("Choose the base number output: ", 1, 3);
            baseNumberController.setBaseNumberOutput(choice);

            
            baseNumberController.setInputValue();

           
            baseNumberController.convertBaseNumber();

           
            baseNumberController.displayValue();

            
            if (!Validator.choiceYesOrNo("Do you want to continue(Y) or not(N)?")) {
                return;
            }
        }
    }

    private static void showListOfBaseNumber() {
        System.out.println("=========List Base Number==========");
        System.out.println("1. Hexadecimal");
        System.out.println("2. Decimal");
        System.out.println("3. Binary");
    }
    
    

}
