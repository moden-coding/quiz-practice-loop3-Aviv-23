/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. The test scores should be in a range from 0 to 100. If the user enters an invalid number
 *  tell them to re-enter the value. Keep track of the number of passing and failing test grades. Assume 
 *  that a failing grade is below a 60. When the user enters '-1', print out the number of passing and failing students.
 */


 import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int pass=0;
        int fail=0;
   while(true){
    int number=Integer.valueOf(scanner.nextLine());
    if(number==-1){
        System.out.println(pass+" Passing grades and "+fail+" failing grades");
    break;
    }else if(number<0||number>100){
        System.out.println("Invalid input");
    }else if(number>=60){
    pass++;
 }else{
    fail++;
 }
    
   }
    }
}
