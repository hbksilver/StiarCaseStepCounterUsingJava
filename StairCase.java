import java.lang.*;
import java.util.*;

// Calculate number of steps to reach a top of stairway
//only one or two steps at a time
//developed by: Hassan Baraka
//12/14/2021
public class StairCase
{
    // a function that calculates the steps
    public static int calculateStairSteps(int stairCaseCount) {
        if (stairCaseCount == 0)
        return 1;
        else if (stairCaseCount > 0)
        return calculateStairSteps(stairCaseCount - 2)
        + calculateStairSteps(stairCaseCount - 1);
        else 
        return 0;
        
    }
    // main method or function
    public static void main(String argc[]) {
        int myNumber;
        Scanner input = new Scanner(System.in);
        do 
        {
            System.out.println("Enter the number of stair steps; enter negative number to exit: ");
            myNumber = input.nextInt();
            System.out.println(calculateStairSteps(myNumber));
        }
        while (myNumber >= 0);
        input.close();
    }
}

    