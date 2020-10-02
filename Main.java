import java.util.Scanner;
/**
 * This program finds the maximum integer between 3 numbers that the user inputs
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // import scanner for user inputs
    Scanner input = new Scanner(System.in); 
    
    // ask the user for 3 integers on seperate lines
    System.out.println("Please enter three integers on separate lines");

    int integer1 = input.nextInt();
    int integer2 = input.nextInt();
    int integer3 = input.nextInt();

    if(integer1 > integer2 && integer1 > integer3){
      System.out.println("Maximum: " + integer1);
    } else if(integer2 > integer1 && integer2 > integer3){
      System.out.println("Maximum: " + integer2);
    } else{
      System.out.println("Maximum: " + integer3);
    }
  }
}
