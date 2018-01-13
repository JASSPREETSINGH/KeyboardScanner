/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboardscanner;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class KeyboardScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int num1;
      double num2;
      String name;
      double sum;
    
      // Setup a Scanner called in to scan the keyboard (System.in)
      Scanner in = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      num1 = in.nextInt();     // use nextInt() to read int
      System.out.print("Enter a floating point number: ");
      num2 = in.nextDouble();  // use nextDouble() to read double
      System.out.print("Enter your name: ");
      name = in.next();        // use next() to read String
   
      // Display
        System.out.println("the integer that gets readed is "+num1);
        System.out.println("the floated point number is "+num2);
        System.out.println("the name of the person is "+name);
        
      // Close the input stream
      in.close();
    }
    
}
