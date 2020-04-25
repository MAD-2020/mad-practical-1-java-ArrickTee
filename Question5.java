import java.util.Scanner;
import java.util.ArrayList;

public class Question5
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
    int number_int = in.nextint();
    int[] num_list
    int final_num;
    int num;
    int count_final;
    int count;
    ArrayList<String> num_list = new ArrayList<String>();
    
    for (i = 0; i < number_int; i++){
      string number = "";
      number = in.nextint();
      num_list.add(number);
      }
      
    Collection.sort(num_list);
    final_num = num_list
    for (i = 0; i < number_int; i++){
      num = num_list[i];
      switch(num){
        case final_num:
          count = count + 1;
          break;
        default:
          if (final_count > count){
            break;
          }
          else{
            final_num = num;
            break;
          }
      }
      System.out.println(final_num);
    }   
  }
}
