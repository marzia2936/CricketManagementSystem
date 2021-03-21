
package Package2;

import java.util.Scanner;

public class Cricketer {
    String name;
    String country;
    int number_of_runs;
    int number_of_wickets;
    int numbers_of_matches;
    int age;
    Scanner input = new Scanner(System.in);
    public void increaseRun(int run){
        number_of_runs=run;
       
    }
    
   public void increaseWicket(int wicket){
        number_of_wickets=wicket;
    } 
    
    
    public void increaseMatch(int match){
     numbers_of_matches = match;  
    }
    
    public void printall(){
            System.out.println(" Cricketer Run:"+number_of_runs);
            System.out.println(" Cricketer Wicket"+number_of_wickets);
            System.out.println(" Cricketer Match"+numbers_of_matches);
   
    }
    
    
}
