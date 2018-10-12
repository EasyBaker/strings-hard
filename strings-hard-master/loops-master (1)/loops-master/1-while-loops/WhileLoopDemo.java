/**
 * This program demonstrates the while loop.
 *
 * @author Jon Cooper
 * @version Nov. 2, 2011
 */

public class WhileLoopDemo 
{
    public static void oneToTen()
    {
        int i = 1; // set starting count
        
        while (i <= 10) // test condition
        {
            // display the current value for the counter on the screen
            System.out.print(i + " ");

            // incriment the counter or we'll never get out of the loop
            i++;    
        }
        
        System.out.println("All done.");        
    }
    
    public static void rocketLaunch()
    {
        int i = 10;
        
        while (i >= 1)
        {
            System.out.print(i + " ");
            i--;
        }
        
        System.out.println("Blast off!");       
    }
    
    public static void noHacking(int n)
    {
        int i = 1;
        
        while ( i<= n)
        {
            System.out.println("I will not hack the school's computers.");
            i++;
        }
    }
    
    public static void main(String[] args)
    {
        oneToTen();
        rocketLaunch();
        noHacking(20);
    }
}