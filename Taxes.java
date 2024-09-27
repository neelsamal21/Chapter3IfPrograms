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
        if(income<= 50000){
            System.out.println("Income of " + income + ", Tax: "+ (income*.01));
        }
        else if(income > 50000 && income <= 75000){
            nextBrac = 75000-income;
            System.out.println("Income of " + income + ", Tax: "+ ((nextBrac*.02)+500));
            
        }
        else if(income > 75000 && income <= 100000)
            nextBrac = 100000-income;
            //System.out.println("Income of " + income + ", Tax: "+ ((nextBrac *.03)+1500));
        
    }
}
