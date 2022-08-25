package com.jap;

public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber) {
        //create local variable
        String temp = "";
        int finalNumber = 0;
        try {
            //write logic
            finalNumber = firstNumber / secondNumber;
            temp = Integer.toString(finalNumber);

            //Handle specific exception
        } catch ( ArithmeticException exception) {
            temp = exception.toString();
        }

        return temp;
    }
}
