import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    double weight = in.nextDouble();
    double BMI = height / (weight * weight);
    
    System.out.println("Your height is: " + height);
    System.out.println("Your weight is: " + weight);
    System.out.println("Your BMI is: " + BMI);
  }
}
