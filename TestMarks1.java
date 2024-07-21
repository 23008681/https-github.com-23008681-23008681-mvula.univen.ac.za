/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testmarks1;

import java.util.Scanner;
public class TestMarks1 {

    public static void main(String[] args) {
       Scanner results=new Scanner(System.in);
       
       /*the scanner used is to allow the the teacher
       to enter the different marks the learners accumulated
       from their tests
       */
       
       
       System.out.println("PLEASE ENTER THE LEARNERS RESULTS");
       int marks=results.nextInt();
       //i used the data type int because the marks a learner accumulate is an integer not decimals
       
       //the following if statements will assist with evaluating the marks entered and provide the level accumulated
        
        if(marks>=80){System.out.println("OUTSTANDING LEVEL ACCUMULATED");}
        
        else if(marks>=70 && marks<80){System.out.println("MERITORIOUS LEVEL ACCUMULATED");}
        
        else if(marks>=60 && marks<70){System.out.println("SUBSTANTIAL LEVEL ACCUMULATED");}
        
        else if(marks>=50 && marks<60){System.out.println("ADEQUATE LEVEL ACCUMULATED");}
        
        else if(marks>=40 && marks<50){System.out.println("MODERATE LEVEL ACCUMULATED");}
        
        else if(marks>=30 && marks<40){System.out.println("ELEMENTARY LEVEL ACCUMULATED");}
         
        else if(marks>=0 && marks<30){System.out.println("THE LEARNER IS NOT ACHIEVED");}
        
}

    }

