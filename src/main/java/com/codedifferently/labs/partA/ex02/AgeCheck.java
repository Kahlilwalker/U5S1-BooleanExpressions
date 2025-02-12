package com.codedifferently.labs.partA.ex02;

import java.util.Scanner;

public class AgeCheck {
    public static String age(){
        String response= "";

        Scanner in = new Scanner(System.in);
        int myAge = 0;
        System.out.println("Enter your age:");
        myAge = in.nextInt();

        if (myAge >= 16) {
            response += ("I'm old enough to have a driver's license!");
        }
        if (myAge < 16) {
            response += ("I'm not old enough yet... :*(");
        }


        return response;
    }
    public static void main(String[] args) {
        String ageOutput = age();
        System.out.println(ageOutput);
    }
}
