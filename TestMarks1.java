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
        
        if(marks>=80){System.out.println("OUTSTANDING ACHIEVEMENT-LEVEL-7 ACCUMULATED");}
        
        else if(marks>=70 && marks<80){System.out.println("MERITORIOUS ACHIEVEMENT-LEVEL-6 ACCUMULATED");}
        
        else if(marks>=60 && marks<70){System.out.println("SUBSTANTIAL ACHIEVEMENT-LEVEL-5 ACCUMULATED");}
        
        else if(marks>=50 && marks<60){System.out.println("ADEQUATE ACHIEVEMENT-LEVEL-4 ACCUMULATED");}
        
        else if(marks>=40 && marks<50){System.out.println("MODERATE  ACHIEVEMENT-LEVEL-3 ACCUMULATED");}
        
        else if(marks>=30 && marks<40){System.out.println("ELEMENTARY ACHIEVEMENT-LEVEL-2 ACCUMULATED");}
         
        else if(marks>=0 && marks<30){System.out.println("THE LEARNER IS NOT ACHIEVED LEVEL-1 ACCUMULATED");}
        
        else if(marks<0 || marks>100){System.out.println("INVALID LEVEL ACCUMULATED");}
        
}}


