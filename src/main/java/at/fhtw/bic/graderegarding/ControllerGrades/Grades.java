package at.fhtw.bic.graderegarding.ControllerGrades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Grades {
    @GetMapping("/Grades")
    public static void main(String args[])
    {
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);


        for(i=0; i<6; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("1");
        }
        else if(avg>=60 && avg<80)
        {
            System.out.print("2");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.print("3");
        }
        else
        {
            System.out.print("4");
        }
    }
}