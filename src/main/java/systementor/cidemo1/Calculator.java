package systementor.cidemo1;

public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide (int b, int a) {
        if (b == 0){
            throw new IllegalArgumentException("Divide by zero");
        }
        return a / b;
    }


}
