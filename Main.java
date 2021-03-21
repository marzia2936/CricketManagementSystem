
package Package1;

import Package2.Cricketer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cricketer c1= new Cricketer();
       System.out.println(" Enter Cricketer Run:");
       Scanner input = new Scanner(System.in);
       int Run1 = input.nextInt();
       c1.increaseRun(Run1);
       System.out.println(" Enter Cricketer Wicket:");
       int wicket1 = input.nextInt();
       c1.increaseWicket(wicket1);
       System.out.println(" Enter Cricketer Match:");
       int match1 = input.nextInt();
       c1.increaseMatch(match1);
       c1.printall();
    }
    
}
