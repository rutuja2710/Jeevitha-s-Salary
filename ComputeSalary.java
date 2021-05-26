import java.util.*;

public class ComputeSalary {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int hoursWorked[] = new int [7];        //number of hours worked per day in a week
        int totalHours=0, salary=0;

        System.out.println("enter the hours worked - ");
        for(int i=0;i<hoursWorked.length;i++)
            hoursWorked[i] = scanner.nextInt();

        //salary on Sunday - 50% bonus
        salary+=hoursWorked[0]*150;

        //salary from Monday to Friday
        for(int i=1;i<hoursWorked.length-1;i++) {
            totalHours+=hoursWorked[i];
            salary += hoursWorked[i] * 100;

            //extra Rs.15 an hour more tha 8 hours
            if (hoursWorked[i] > 8)
                salary += (hoursWorked[i]-8)*15;
        }

        //salary on Saturday - 25% bonus
        salary+=hoursWorked[6]*125;

        //extra 25 for hours beyond 40
        if(totalHours>40)
            salary+=(totalHours-40)*25;

        System.out.println("Jeevitha's salary for the week is Rs. "+salary);
    }
}
