package GradeCalc;

import java.util.Scanner;

public class Student {
    int TotalSubjects = 7;
    int avgMarks;
    int totalObtained;
    private Scanner scanner;

    //constructor
    public Student(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public int getValidMarks(String subName ) {
    	
        int marks;
        
        // using do while loop
        
        do {
        	System.out.println("enter your marks in"+" "+subName+"(0-100):");
        	marks=scanner.nextInt();
        	if(marks<=0 ||marks>=100) {
        		System.out.println("invalid marks");
        	}
        }while(marks<=0 || marks>=100);
         return marks;
    
    }
    public int subjects() {
    	int telugu=getValidMarks("telugu");
    	int hindi=getValidMarks("hindi");
    	int english=getValidMarks("english");
    	int maths=getValidMarks("maths");
    	int physics=getValidMarks("physics");
    	int biology=getValidMarks("biology");
    	int social=getValidMarks("social");
		 
    	 totalObtained=telugu+hindi+english+maths+physics+biology+social;
        System.out.println("Total Marks="+totalObtained);
    	  
    	avgMarks = totalObtained/TotalSubjects;
    	
    	return avgMarks;
    }
    
    public void Grade() {
    	int marks = this.avgMarks;
    	
    	if(marks>=91 && marks<=100) {
    		System.out.println("congrats you got O(outstanding) grade");
    	}else if(marks>=81 && marks<=90) {
    		System.out.println("congrats you got A+ grade");
    	}else if(marks>=71 && marks<=80) {
    		System.out.println("congrats you got A grade");
    	}else if(marks>=61 && marks<=70) {
    		System.out.println("congrats you got B+ grade");
    	}else if(marks>=51 && marks<=60) {
    		System.out.println("congrats you got B grade");
    	}else if(marks>=41 && marks<=50) {
    		System.out.println("congrats you got C+ grade..try harder next time");
    	}else if(marks>=31 && marks<=40) {
    		System.out.println("congrats you got c grade..try harder next time");
    	}else {
    		System.out.println("Fail.. Better luck next time");
    	}
    }
    
}      
        
        

