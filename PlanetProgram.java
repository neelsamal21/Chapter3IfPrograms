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
        System.out.println("What is your weight on Earth (In lbs) ?: ");
        double weight = keyboard.nextDouble();
        
        char choice;
         
        System.out.println("What planet would you like to see how much you weigh on?");
        System.out.println("M) Moon ");
        System.out.println("m) Mercury ");
        System.out.println("V) Venus ");
        System.out.println("R) Mars ");
        System.out.println("J) Jupiter ");
        System.out.println("S) Saturn ");
        System.out.println("U) Uranus " );
        System.out.println("N) Neptune");
        
        choice = keyboard.next().charAt(0);// first character 
        DecimalFormat format = new DecimalFormat("#.##");
        switch(choice)
        {
            case 'M':
                System.out.println("Your weight on the Moon is : "+format.format(( weight/6)) + " pounds." );
                break;
            case 'm':
                System.out.println("Your weight on Mercury is : " + format.format(( weight*.38) )+ " pounds." );
                break;
            case 'V':
                System.out.println("Your weight on Venus is: " + format.format(( weight*.91 ))+ " pounds." );
                break;
            case 'R':
                System.out.println("Your weight on Mars is: "+format.format(( weight*.38))+ " pounds."  );
                break;
            case 'J':
                System.out.println("Your weight on Jupiter is: "+ format.format((weight*2.34))+ " pounds." );
                break;
            case 'S':
                System.out.println("Your weight on Saturn is :" +format.format((weight*1.06))+ " pounds." );
                break;
            case 'U':
                System.out.println("Your weight on Uranus is :" +format.format((weight*.92))+ " pounds." );
                break;
            case 'N':
                System.out.println("Your weight on neptune is :" +format.format(( weight*1.19))+ " pounds." );
                break;
                
            default:
                System.out.println("Incorrect Input ");
        }
        
        
    }
    
}
