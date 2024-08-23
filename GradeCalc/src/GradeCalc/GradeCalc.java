package GradeCalc;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an instance of Student with the scanner
        Student obj = new Student(scanner);

        int total = obj.subjects();
        System.out.println("average Marks:"+ total);
        obj.Grade();
        
        scanner.close();  // Close the scanner 
    }
}
