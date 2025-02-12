package com.codedifferently.labs.partB.ex04;


import java.util.Scanner;

public class IfElse {

    public static String equalToSeven(){
        String response = "";
        /* Put your code in between these comments : Top */
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter any number:");
        num = in.nextInt();
        in.close();

        if (num == 7){
            response += "That’s lucky!";
        }

        else {
            response += "That's unlucky";
        }

        /* Put your code in between these comments : Bottom */


        return response;
    }
    public static void main(String[] args) {
        String luckyOutput = equalToSeven();
        System.out.println(luckyOutput);
    }
}
