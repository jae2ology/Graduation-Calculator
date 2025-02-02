import java.util.Scanner;

/**
 * File: Lab03Prob01.java
 * Class: CSCI 1301 H
 * Author: Jae Jackson
 * Created: Jan 31, 2025
 * Last Modified: Jan 31, 2025
 * Description: This program determines the number of hours, semesters, and years left until graduation.
 */

public class Lab03Prob03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // program will output hours until graduation, semesters left until graduation, and years left until graduation
        System.out.println("Enter your current accumulated credit hours: ");
        int accumCredit = input.nextInt(); 

        System.out.println("Enter total number of credits for your degree: ");
        int totalCreditForDegree = input.nextInt(); 

        int hoursUntilGrad = (totalCreditForDegree - accumCredit);

        double semestersUntilGrad = (double) hoursUntilGrad / 15; // assuming 15 credit hours in a semester, this will give the number of semesters left until graduation
        // double in parantheses is converting the integer to a double
        double yearsUntilGrad1 = semestersUntilGrad / 2; // assuming 2 semesters in a year
        double yearsUntilGrad2 = semestersUntilGrad / 3; // assuming 3 semesters in a year

        int yearsLeft = (int) yearsUntilGrad1; // years left assuming 2 semesters in a year with 15 credit hours per semester
        int semestersLeft = yearsLeft % 2; // semesters left assuming 2 semesters in a year with 15 credit hours per semester
        int hoursLeft = hoursUntilGrad % 15; // hours left assuming 2 semesters in a year with 15 credit hours per semester

        int yearsLeft2 = (int) yearsUntilGrad2; // years left assuming 3 semesters in a year with 15 credit hours per semester
        int semestersLeft2 = yearsLeft2 % 3; // semesters left assuming 3 semesters in a year with 15 credit hours per semester
        int hoursLeft2 = hoursUntilGrad % 15; // hours left assuming 3 semesters in a year with 15 credit hours per semester

        System.out.println("You have " + accumCredit + " credit hour(s).");
        System.out.println("Your degree requires " + totalCreditForDegree + " credit hour(s).");
        System.out.println("You have " + hoursUntilGrad + " credit hour(s) until graduation.");
        System.out.println("You have " + semestersUntilGrad + " semester(s) (@ 15 credit hours/semester) left until graduation.");
        System.out.println("You have " + yearsUntilGrad1 + " year(s) (@ 2 semesters/year) left until graduation.");
        System.out.println("You have " + yearsUntilGrad2 + " year(s) (@ 3 semesters/year) left until graduation.");

        System.out.println("You have " + yearsLeft + " year(s), " + semestersLeft + " semester(s), and " + hoursLeft + " credit hour(s) (@ 2 semesters/year) left until graduation.");

        System.out.println("You have " + yearsLeft2 + " year(s), " + semestersLeft2 + " semester(s), and " + hoursLeft2 + " credit hour(s) (@ 3 semesters/year) left until graduation.");



    }
}
