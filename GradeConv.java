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
        System.out.println("Enter a letter grade: ");
        String grade = keyboard.nextLine(); 
        String letter=grade.substring(0,1);
        String sign = grade.substring(1,2);
        System.out.println(sign);
        double numValue;
        
        
        if (letter == "A")
               numValue = 4;
        if(letter == "B")
            numValue = 3;
        if(letter == "C")
            numValue = 2;
        if(letter == "D")
            numValue = 1;
        if(letter == "F");
            numValue = 1;
        //if(sign == "+")
          // if (letter == "B""C"||"D")
              // numValue += 0;
    
            
        
    }
}
