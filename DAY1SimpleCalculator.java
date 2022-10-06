// wellcome to my github account 
// This is My 1st Program on JAVA
// Day 1  challange

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a Simple Calculator");
        System.out.println("Here are your options select operation :");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int choice = input.nextInt();
        System.out.println();
        if (choice==1){
            addition();
        }
        else if (choice==2){
            subtraction();
        }
        else if (choice==3){
            multiplication();
        }
        else if (choice==4){
            division();
        }
        System.out.println();
        input.close();
    }
    public static void addition() {
        int one,two;
        Scanner input = new Scanner(System.in);
        System.out.println("Addition");
        System.out.print("Enter first number: ");
        one=input.nextInt();
        System.out.print("Enter second number: ");
        two=input.nextInt();
        input.close();
        System.out.print("\nsum: " +one + "+" + two + "=" +(one+two));

    }
    public static void subtraction() {
        int one,two;
        Scanner input = new Scanner(System.in);
        System.out.println("Subtraction");
        System.out.print("Enter first number: ");
        one = input.nextInt();
        System.out.print("Enter second number: ");
        two = input.nextInt();
        input.close();
        System.out.print("\sub: " +one +"-" +two + "=" +(one-two));
    }
    public static void multiplication(){
        int one,two;
        Scanner input = new Scanner(System.in);
        System.out.println("Subtraction");
        System.out.print("Enter first number: ");
        one = input.nextInt();
        System.out.print("Enter second nuber:");
        two = input.nextInt();
        input.close();
        System.out.println("\nMul: " +one +"*"+two + "="+(one*two));
    }
    public static void division(){
        int one,two;
        Scanner input= new Scanner(System.in);
        System.out.println("Division");
        System.out.print("Enter first number: ");
        one = input.nextInt();
        System.out.print("Enter second number: ");
        two = input.nextInt();
        input.close();
        System.out.println("\n division: "+one +"/" +two +"=" +(one/two));
    }
}
