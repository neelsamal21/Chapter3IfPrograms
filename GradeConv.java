import java.util.Scanner;
import java.text.*;



/**
 * Neel Samal
 * Grade Converter
 * 9/20/24
 */
public class GradeConv
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a letter grade, ensure it's uppercase: ");
        String grade = keyboard.nextLine(); 
        String letter=grade.substring(0,1);
        String sign = grade.substring(1,2);
        double numValue;
        
        System.out.println(letter);
        if (letter == "A")
               numValue = 4;
        if(letter == "B")
            numValue = 3;
        if(letter == "C")
            numValue = 2;
        if(letter == "D")
            numValue = 1;
        if(letter == "F");
            numValue = 0;
        if(sign == "+")
          if (letter =="A"||letter == "F")
             numValue = numValue+0;
          else
              numValue = numValue +0.3;
        else if(sign == "-")
           if(letter == "F")
               numValue = numValue-0;
           else
              numValue = numValue -0.3;
              
        System.out.println("Numeric value is: "+ numValue);
        
        
    }
}
