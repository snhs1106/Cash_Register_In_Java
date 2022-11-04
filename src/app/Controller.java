//=============================================================================
// PROGRAMMER:              STEPHANIE HERNANDEZ
// PANTHER ID:              6297754
//
// CLASS:                   COP2210



// SECTION:                 U02
// SEMESTER:                Fall 2022
// CLASSTIME:               T/TH 6:25PM - 9:05PM
//
// Project:                 Project 1
// DUE:                     OCTOBER 30, 2022
//
// CERTIFICATION:           I understand FIU's academic policies, and I certify that this work is my
//                          own and that none of it is the work of any other person.
//
// =============================================================================

package app;
import food.Apple;
import food.Sandwich;
import machine.Register;
import transactions.Payment;

public class Controller {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("COP 2210 - Project 1 Output");
        System.out.println("Stephanie Hernandez");
        System.out.println("6297754");
        System.out.println("U02");
        System.out.println("===============================================");
        System.out.println("\n");

        Register register = new Register(15, 20, 10, 20, 50);
        register.cashInfo("Manager");
        register.cashInfo("Staff");

        Apple grannySmith = new Apple("GrannySmith", 140, 1.51);
        grannySmith.displayInfo();

        Payment applePayment1 = new Payment(10,0,0,0,47);
        applePayment1.displayInfo();

        register.buyApple(grannySmith, applePayment1);
        register.cashInfo("Manager");

        Apple macintosh = new Apple("Macintosh", 150, 1.70);
        macintosh.displayInfo();

        Payment applePayment2 = new Payment(0, 2, 0, 0, 0);
        applePayment2.displayInfo();
        register.buyApple(macintosh, applePayment2);
        register.cashInfo("Manager");

        Sandwich sandwich = new Sandwich(true, true, true);
        sandwich.displayInfo();

        Payment sandwichPayment1 = new Payment(5, 2, 1, 1, 2);
        sandwichPayment1.displayInfo();

        register.buySandwich(sandwich, sandwichPayment1);
        register.cashInfo("Manager");

        boolean meat = true;
        boolean cheese = true;
        boolean veggies = true;
        System.out.println("");

        for(int i = 1; i <= 8; i++){
            if(i <= 4){
                meat = true;
                if(i<=2){
                    cheese = true;
                    if(i == 1){
                        veggies = true;
                    }
                    else{
                        veggies = false;
                    }
                }
                else{
                    cheese = false;
                    if(i == 3){
                        veggies = true;
                    }
                    else{
                        veggies = false;
                    }
                }
            }
            else{
                meat = false;
                if(i <= 6){
                    cheese = true;
                    if(i == 5){
                        veggies = true;
                    }
                    else{
                        veggies = false;
                    }
                }
                else{
                    cheese = false;
                    if(i == 7){
                        veggies = true;
                    }
                    else{
                        veggies = false;
                    }
                }
            }
            System.out.println("==========================================================");
            System.out.println("==========================================================");
            Sandwich s = new Sandwich(meat, cheese, veggies);
            Payment s1 = new Payment(10, 0, 0, 0, 0);
            s.displayInfo();
            s1.displayInfo();
            register.buySandwich(s, s1);
            register.cashInfo("Manager");
            System.out.println("==========================================================");
            System.out.println("==========================================================");
            System.out.println("");
        }
    }//end main
}//end class
