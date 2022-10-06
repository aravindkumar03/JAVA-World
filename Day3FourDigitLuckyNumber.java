// This is a Lucky number checker which it is accepts only 4 digit 
// to find weather it is lucky number or not we use a method like A+B=C+D

import java.util.Scanner;
public class FourDigitLuckyNumber {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Four Digit Number(ex: 1230) :");
        num = input.nextInt();//ABCD
        int fourthDigit = num % 10;// D
        int thirdDigit = (num/10)%10; // C
        int secondDigit = (num/100)%10; // B
        int firstDigit = (num/1000)%10; // A
        // Lucky number = A+B == C+D
        if(num>999 && num<10000){
            if(firstDigit + secondDigit == thirdDigit + fourthDigit ){
                System.out.println("This is a Lucky Number :"+num);
            }
            else{
                System.out.println("This is not a Lucky Number :"+num);
            }
        }
        else{
            System.out.println("Please check the format you enter");
        }

    }
}
