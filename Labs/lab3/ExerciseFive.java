/** 
* Excercise Five
* Lab Three
**/

import java.util.Scanner;

public class ExerciseFive {

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        int gradeCounter; // number of grades
        int totalGrades; // sum of grades
        int grade; // user input grade
        double average; // average grade

        totalGrades = 0; // set total to 0
        gradeCounter = 0; // set grade counter to 0

        System.out.print( "Enter grade or -1 to quit: " );
        grade = input.nextInt();
        
        while ( grade != -1 ) { 
            totalGrades = totalGrades + grade; // add grade to total
            gradeCounter = gradeCounter + 1; // increment
            
            System.out.print( "Enter grade or -1 to quit: " ); //prompt
            grade = input.nextInt(); // input next grade

            if {
            
            }

        } // end while
        
        if ( gradeCounter != 0 ) {
            average = (double) totalGrades / gradeCounter; // get average

            System.out.printf( "\nTotal of the %d grades entered is %d\n", 
            gradeCounter, totalGrades );
            System.out.printf( "Class average is %.2f\n", average );
        } // end if
        
        else // no grades entered
            System.out.println( "No grades were entered" );
            
    } // end main
} // end class ExerciseFive
