import java.util.Scanner;
import java.text.*;
/**
 * Neel Samal
 * MiniVan program
 * 9/29
 */
public class MiniVan
{
    public static void main(String[] args){
        System.out.println( "\n" + "Enter the car combination");
        Scanner keyboard = new Scanner(System.in);
        String car = keyboard.nextLine();
        String DL = car.substring(0,1);
        String DR = car.substring(1,2);
        String CL = car.substring(2,3);
        String MU = car.substring(3,4);
        String IL = car.substring(4,5);
        String IR = car.substring(5,6);
        String OL = car.substring(6,7);
        String OR = car.substring(7,8);
        String Gear = car.substring(8,9);
        
        if(Gear.equals("P") && MU.equals("1") )
            if(DL.equals("1")|| (IL.equals("1") && CL.equals("0") || OL.equals("1"))){
                System.out.print(" The left door opens and ");
            }
            else
                System.out.print("The left door is closed and ");
        if(Gear.equals( "P") && MU.equals("1")){
            if(DR.equals("1") || (IR.equals("1") && CL.equals("0")) || OR.equals("1"))
                System.out.print(" the right door opens");
            else
                System.out.print(" the right door stays closed" );
        }
        else if (Gear.equals("R") || Gear.equals("N") || Gear.equals("D") || Gear.equals("1") || Gear.equals("2") || Gear.equals("3"))
            System.out.println("Both doors closed ");
        else if(MU.equals("0"))
            System.out.println("Both Doors closed ");
        
        
        
    }
}
