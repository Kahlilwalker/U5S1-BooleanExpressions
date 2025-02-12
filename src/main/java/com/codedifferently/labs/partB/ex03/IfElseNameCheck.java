package com.codedifferently.labs.partB.ex03;

import java.util.Scanner;

public class IfElseNameCheck {
    public static String nameCheck(String name){
        String response = "";
        /* Put your code in between these comments : Top */

        Scanner in = new Scanner(System.in);


        System.out.print("Enter first name: ");
        String name1 = in.nextLine();

        in.close();

        if (name1.equals("Elvis")){
            response += "You are the king of rock and roll";
            return response;
        }




        /* Put your code in between these comments : Bottom */



        return response;

    }

    public static void main(String args[]) {
        String name = "";
        /* Put your code in between these comments : Top */


        /* Put your code in between these comments : Bottom */


        String responseToName  = nameCheck(name);
        System.out.println(responseToName);
    }

}
