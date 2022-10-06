// This is a CurrencyConverter
// In this program i used to convert 5 different currencies
// well, this are the currency update from date: 5-10-2022

import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int source;
        System.out.println("This is a currency converter");
        System.out.println("Select your currency :");
        System.out.println("1.India (Rupees)");
        System.out.println("2.USA (dollers)");
        System.out.println("3.chaina (yuans)");//1 yuan = 11.46 rupee
        System.out.println("4.Japan (yen)");// 1 yen = 0.56 rupee
        System.out.println("5.Dubai (Dirham)");// 1 dirham = 22.21 rupee
        source = input.nextInt();
        if (source == 1){
            india();
        }
        else if(source == 2){
            usa();
        }
        else if(source == 3){
            chaina();
        }
        else if (source == 4){
            japan();
        }
        else if (source == 5){
            dubai();
        }
        input.close();
    }
    public static void india(){
        double destination,money;
        Scanner input = new Scanner(System.in);
        System.out.println("Select currency you want to convert :");
        System.out.println("1.India (Rupees)");
        System.out.println("2.USA (dollers)");
        System.out.println("3.chaina (yuans)");
        System.out.println("4.Japan (yen)");
        System.out.println("5.Dubai (Dirham)");
        destination = input.nextInt();
        if (destination == 1){
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :"+(money*1)+" 5Rupees");
        }
        else if (destination == 2){
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :"+(money*0.0123)+" dollers");
        }
        else if (destination == 3){
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :"+(money*0.087)+" yuans");
        }
        else if (destination == 4){
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :"+(money*1.7724)+" yens");
        }
        else if (destination == 5){
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :"+(money*0.045)+" Dirhams");
        }
    }
    public static void usa(){
        double destination, money;
        Scanner input = new Scanner(System.in);
        System.out.println("Select currency you want to convert :");
        System.out.println("1.India (Rupees)");
        System.out.println("2.USA (dollers)");
        System.out.println("3.chaina (yuans)");
        System.out.println("4.Japan (yen)");
        System.out.println("5.Dubai (Dirham)");
        destination = input.nextInt();
        if (destination == 1) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*81.67 ) + " Rupees");
        } else if (destination == 2) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*1) + " Dollers");
        } else if (destination == 3) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*7.12) + " Yuans");
        } else if (destination == 4) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*144.78) + " yens");
        } else if (destination == 5) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*3.67) + " Dirhams");
        }
    }
    public static void chaina() {
        double destination, money;
        Scanner input = new Scanner(System.in);
        System.out.println("Select currency you want to convert :");
        System.out.println("1.India (Rupees)");
        System.out.println("2.USA (dollers)");
        System.out.println("3.chaina (yuans)");
        System.out.println("4.Japan (yen)");
        System.out.println("5.Dubai (Dirham)");
        destination = input.nextInt();
        if (destination == 1) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*11.47) + " Rupees");
        } else if (destination == 2) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*0.14) + " Dollers");
        } else if (destination == 3) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*1) + " Yuans");
        } else if (destination == 4) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*20.34) + " yens");
        } else if (destination == 5) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*0.52) + " Dirhams");
        }
    }
    public static void japan() {
        double destination, money;
        Scanner input = new Scanner(System.in);
        System.out.println("Select currency you want to convert :");
        System.out.println("1.India (Rupees)");
        System.out.println("2.USA (dollers)");
        System.out.println("3.chaina (yuans)");
        System.out.println("4.Japan (yen)");
        System.out.println("5.Dubai (Dirham)");
        destination = input.nextInt();
        if (destination == 1) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*0.56) + " Rupees");
        } else if (destination == 2) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*0.0069) + " Dollers");
        } else if (destination == 3) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*0.049)+" yuans");
        } else if (destination == 4) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*1) + " yens");
        } else if (destination == 5) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*0.025) + " Dirhams");
        }
    }
    public static void dubai() {
        double destination, money;
        Scanner input = new Scanner(System.in);
        System.out.println("Select currency you want to convert :");
        System.out.println("1.India (Rupees)");
        System.out.println("2.USA (dollers)");
        System.out.println("3.chaina (yuans)");
        System.out.println("4.Japan (yen)");
        System.out.println("5.Dubai (Dirham)");
        destination = input.nextInt();
        if (destination == 1) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*22.22 ) + " Rupees");
        } else if (destination == 2) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*0.27) + " Dollers");
        } else if (destination == 3) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*1.94) + " yuans");
        } else if (destination == 4) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*39.42) + " yens");
        } else if (destination == 5) {
            System.out.print("Enter Amount to convert :");
            money = input.nextInt();
            System.out.print("The converted amount is :" + (money*1) + " Dirhams");
        }
    }
}
