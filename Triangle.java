import java.util.Scanner;
import java.text.*;
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to enter sides or angles (s/a)");//chooses between angle or sides
        String choice = keyboard.nextLine();
        if(choice.equals("s")){
            System.out.println("Enter Side 1 :");
            int Side1 = keyboard.nextInt();
            System.out.println("Enter Side 2 :");
            int Side2 = keyboard.nextInt();
            System.out.println("Enter Side 3 :");
            int Side3 = keyboard.nextInt();
            if(Side1==Side2 && Side1==Side3 && Side2==Side3)
                System.out.println("The triangle is equilateral");
            else if(Side1!=Side2 && Side1 != Side3 && Side2 != Side3)
                System.out.println("The triangle is Scalene");}
            
        else{
            System.out.println("Enter Angle 1 :");
            int Angle1 = keyboard.nextInt();
            System.out.println("Enter Angle 2 :");
            int Angle2 = keyboard.nextInt();
            System.out.println("Enter Angle 3 :");
            int Angle3 = keyboard.nextInt();
        }
            
        
        
    }
}
