package Java9;

public class PrivateInterfaceMethods {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        calculator.calculate("+"); //Output - Add number.
        calculator.calculate("-"); //Output - Subtract number.
    }
}

interface Calculator {
    default void calculate(String sign) {
        if(sign.equals("-")){
            subtract();
        }
        else if(sign.equals("+")){
            add();
        }
    }

    private void subtract() {
        System.out.println("Subtract number.");
    }

    private void add() {
        System.out.println("Add number.");
    }
}

class CalculatorImpl implements Calculator {

}
