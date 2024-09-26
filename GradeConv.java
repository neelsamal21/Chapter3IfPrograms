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
        
        String letter = grade.substring(0,1);//gets letter grade
        String sign = "";
        
        if(grade.length() == 2)//determines if there is a plus or minus
            sign = grade.substring(1,2);
            
       
        
        double numValue = 0;
        
        //assgins values
        if (letter.equals("A"))
            numValue = numValue+ 4.0;
        else if(letter.equals("B"))
            numValue = numValue+3.0;
        else if(letter.equals("C"))
            numValue = numValue+2.0;
        else if(letter.equals("D"))
            numValue = numValue+1.0;
        else if(letter.equals("F"));
            numValue = numValue+0.0;
        //adds or subtract depending on grade    
        if(sign.equals("+"))
             if (letter.equals("A")||letter.equals("F"))
                 numValue = numValue+0;
             else
                 numValue = numValue +0.3;
        else if(sign.equals("-"))
           if(letter.equals("F"))
               numValue = numValue-0;
           else
              numValue = numValue -0.3;
              
        System.out.println("Numeric value is: "+ numValue);
        
        
    }
}
