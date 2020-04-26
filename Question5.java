import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int number_int = in.nextInt();
    int final_num;
    int num1;
    int num2;
    int count_final = 0;
    int count = 0;
    ArrayList<Integer> num_list = new ArrayList<Integer>();
    
    for (int i = 0; i < number_int; i++){
      int number = 0;
      number = in.nextInt();
      num_list.add(number);
    }
      
    Collections.sort(num_list);
    num1 = num_list.get(0);
    final_num = num1;
    for (int i = 1; i < number_int; i++){
      num2 = num_list.get(i);
      if (num1 != num2){
        count = 0;
      }
      else{
        count += 1;
      }
      num1 = num2;
      if (count_final < count){
        count_final = count;
        final_num = num1;
      }
    } 
    System.out.println(final_num); 
  }
}
