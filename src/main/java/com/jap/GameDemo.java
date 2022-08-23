package com.jap;

public class GameDemo {
    public String divideByNumber(int firstNumber, int secondNumber){
        String res = "";
        try{
            res = Integer.toString(firstNumber / secondNumber);
        }catch (ArithmeticException e){
            res = e.toString();
        }

        return res;
    }

    public static void main(String[] args) {
        GameDemo obj1 = new GameDemo();
        GameDemo obj2 = new GameDemo();
        String output1 = "";
        String output2 = "";
        output1 = obj1.divideByNumber(10,5);
        System.out.println("output = " + output1);

        output2 = obj2.divideByNumber(10,0);
        System.out.println("output2 = " + output2);

    }
}