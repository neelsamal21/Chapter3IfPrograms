import java.util.Scanner;
import java.text.*;
/**
 * Neel Samal
 * Tax calculator
 * 9/27
 */
public class Taxes
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your annual income? :");
        double income = keyboard.nextDouble();
        double nextBrac;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        if(income<= 50000){
            System.out.println("Income of " + money.format(income) + ", Tax: "+ money.format((income*.01)));
        }
        else if(income > 50000 && income <= 75000){
            nextBrac = income-50000;
            System.out.println("Income of " + money.format(income) + ", Tax: "+ money.format(((nextBrac*.02)+500)));
            
        }
        else if(income > 75000 && income <= 100000){
            nextBrac = income-75000;
            System.out.println("Income of " + money.format(income) + ", Tax: "+ money.format(((nextBrac *.03)+1000)));
        
        }
        else if(income>100000 && income<= 250000){
            nextBrac = income-100000;
            System.out.println("Income of " + money.format(income) + ", Tax: "+ money.format(((nextBrac *.04)+1750)));
            
        }
        else if(income>250000 && income <= 500000){
            nextBrac = income-250000;
            System.out.println("Income of " + money.format(income) + ", Tax: "+ money.format(((nextBrac *.05)+7750)));
        }
        else if (income>500000){
            nextBrac = income-500000;
            System.out.println("Income of " + money.format(income) + ", Tax: "+ money.format(((nextBrac *.06)+20250)));
        }
        else
            System.out.println("Incorrect Input");
    }
}
