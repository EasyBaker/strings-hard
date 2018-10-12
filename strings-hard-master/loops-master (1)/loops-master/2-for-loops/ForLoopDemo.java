/**
 * Demonstration of for loops.
 * 
 * A for loop is used we want to step a variable through a 
 * series of values.
 * 
 * Parts of a for loop:
 * 
 *  1. init
 *  2. test
 *  3. body
 *  4. increment
 * 
 * syntax:
 * 
 *  for (init; test; increment) {
 *      body
 *  }
 * 
 * @author Jon Cooper
 * @version October 22, 2013
 */
public class ForLoopDemo 
{
    public static void main (String[] args)
    {
        // count from 1 to 20 by ones
        for (int i=1; i<=20; i=i+1) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // count from 2 to 20 by twos
        for (int i=2; i<=20; i+=2) {
            System.out.print(i + " ");
        }   
        System.out.println();
        
        // print "I will not play games in class" 5 times.
        for (int i=0; i<5; i++)
            System.out.println("I will not play games in class");
        
        
        // count from 10 to 0 and then print "blast off!"
        // (be careful not to write an infinite loop!)
        for (int i=10; i>=0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Blast off!");
        
        
        // find the sum of numbers 1 to 20
        int sum =0;
        
        for (int i=1; i<=20; i++) {
            sum += i;
        }
        
        System.out.println(sum);
        
        // print each letter with a space between
        String str = "J.L. Mann High School";
        
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        
        // print a string backwards
        for (int i = str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();       
        
        
        // count the number of capital letters in a string
        int caps = 0;
        
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            
            if (c >= 'A' && c <= 'Z')
                caps++;
        }
        
        System.out.println(caps);
        
    
    
    }
}
