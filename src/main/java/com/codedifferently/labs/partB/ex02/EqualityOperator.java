package com.codedifferently.labs.partB.ex02;

public class EqualityOperator {
    public static String numEquality(){
        String response = "";
        String num1 = "4";
        String num2 = "5";


        if(num1.equals(num2)){
            response += "true";
        }

        else{
            response += "Are 4 and 5 equal? false";
        }



        return response;
    }
    public static void main(String args[]) {
        String equalityOutput = numEquality();
        System.out.print(equalityOutput);
    }
}
