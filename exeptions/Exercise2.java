
//run this code and follow the instructions of the screen
// the objective is create an user ID from to variables (name and age)
// if you input a string for age it will execute a block with  multiple catch and a single try
package com.company;
import java.util.Scanner;

class NewUserId {
        String name;
        int age;

        public NewUserId(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void getUserId(){
            System.out.println("THIS IS YOUR USER ID:"+name+age);
        }
    }

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("what is your  name  ?");
        String firstInput = scanObj.nextLine();
        System.out.println("what is your age ?-TRY A STRING INSTEAD IF YOU WANT TO SEE TRY-CASH IN ACCION");

        try {
            int secondInput = Integer.parseInt(scanObj.nextLine());
            NewUserId diego = new NewUserId(firstInput, secondInput);
            diego.getUserId();
        } catch (NumberFormatException ex) {
            System.out.println(" That is not a number, write a number");

            try{int secondInput = Integer.parseInt(scanObj.nextLine());
                NewUserId diego = new NewUserId(firstInput, secondInput);
                diego.getUserId();}

            catch (Exception ex2) {
                System.out.println(" That is not a number, write a number");
                int secondInput = Integer.parseInt(scanObj.nextLine());
                NewUserId diego = new NewUserId(firstInput, secondInput);
                diego.getUserId();


            }


        }

    }}
