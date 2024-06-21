package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name=scanner.next();
        
        

        // Prompt the user to enter their age
         System.out.print("Enter your Age:");
         int Age=scanner.nextInt();
         


        // Prompt the user to enter their exam score
       
         System.out.print("Enter your Exam score:");
         int score=scanner.nextInt();
         
         
         System.out.println("Name: "+name);
         System.out.println("Age: "+Age);
         System.out.println("Score: "+score);
         
        // Determine the grade
        

        if (score >= 90)
        {
         System.out.println("grade: A");
        }
        else if (score >=80&& score<=89) {
            System.out.println("grade: B");
        
            
        }
        else if (score >=70&& score<=79) {
            System.out.println("grade: C");
        
            
        }
        else if (score >=60&& score<=69) {
            System.out.println("grade: D");
        
            
        }
        else {
            System.out.println("grade: F");
        }

        // Print the student's details
        
        

       
    }
}
