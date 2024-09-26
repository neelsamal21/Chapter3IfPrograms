import java.util.Scanner;
import java.text.*;
/**
 * Neel Samal
 * PlanetProgram
 * 9/26/24
 */
public class PlanetProgram
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your weight on Earth ?: ");
        double weight = keyboard.nextDouble();
        
        char choice;
         
        System.out.println("What planet would you like to see how much you weigh on?");
        System.out.println("M) Moon ");
        System.out.println("m) Mercury ");
        System.out.println("V) Venus ");
        System.out.println("E) Earth ");
        System.out.println("R) Mars ");
        System.out.println("J) Jupiter ");
        System.out.println("S) Saturn ");
        System.out.println("U) Uranus " );
        System.out.println("N) Neptune");
        
        choice = keyboard.next().charAt(0);// first character 
        
        switch(choice)
        {
            case 'M':
                System.out.println("Your weight on the Moon is : "+(weight/6) );
            case 'm':
                System.out.println("Your weight on Mercury is : " + (weight*.38) );
                
            
        }
        
        
    }
    
}
