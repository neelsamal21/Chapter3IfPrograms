import java.util.Scanner;
import java.text.*;
/**
Neel Samal
Triangle program
9/26
 */
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to enter sides or angles (s/a)");//chooses between angle or sides
        String choice = keyboard.nextLine();
        if(choice.equals("s")) {
    
            System.out.println("Enter Side 1 :");
            int Side1 = keyboard.nextInt();
            System.out.println("Enter Side 2 :");
            int Side2 = keyboard.nextInt();
            System.out.println("Enter Side 3 :");
            int Side3 = keyboard.nextInt();
            
            if(Side1+Side2>Side3 && Side1+Side3>Side2 && Side2+Side3>Side1){//checks if sides are proper
                if(Side1==Side2 && Side1==Side3 && Side2==Side3){
                    System.out.println("The triangle is equilateral");
                } else if(Side1==Side2 || Side1 == Side3 || Side2 == Side3){
                    System.out.println("The triangle is isosceles");
                } else{
                    System.out.println("The triangle is scalene");
                }
                    }
                    
            else
                System.out.println("Invalid side lengths");}
                
                
                
        else{
            System.out.println("Enter Angle 1 :");
            int Angle1 = keyboard.nextInt();
            System.out.println("Enter Angle 2 :");
            int Angle2 = keyboard.nextInt();
            System.out.println("Enter Angle 3 :");
            int Angle3 = keyboard.nextInt();
            if(Angle1+Angle2+Angle3 == 180)//checks angles to verify it's a triangle
            {
                if(Angle1 == Angle2 && Angle2 == Angle3)
                    System.out.println("The triangle is equilaterial");
                else if(Angle1 == Angle2 ||Angle1 == Angle3 || Angle2 == Angle3)
                    System.out.println("The triangle is iscoscles");
                else if(Angle1 == 90 || Angle2 == 90 || Angle3 == 90)
                    System.out.println("This is a right triangle");
                
            }
            else
                System.out.println("Invalid angle measures");//tells user the angles are not accurate
            }
        
            
        
        
    }
}
