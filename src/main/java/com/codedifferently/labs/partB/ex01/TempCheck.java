package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class TempCheck {

    public static String bool(){
        String response= "";


        boolean tShirt, hoody, coat;

        Scanner in = new Scanner(System.in);
        int temp = 75;
        System.out.println("Enter the temperature:");
        temp = in.nextInt();

        if (temp <= 45 ){
            coat = true;
            response += "It's cold - putting on a coat!";
        }

        if (temp >= 46 && temp <= 65){
            hoody = true;
            response += "It's not bad out - a hoodie will do just fine!";
        }

        else {
            tShirt = true;
            response += "It's hot - a T shirt will be perfect.";
        }




        return response;
    }
    public static void main(String args[]) {
        String booleanOutput = bool();
        System.out.println(booleanOutput);

    }
}
