/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compound2;
import java.util.Scanner;
/**
 *
 * @author EPHRAIM MAANDA
 */
public class Compound2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double P,A,N,I;
        System.out.println("ENTER PRINCIPAL AMOUNT");
        P=scanner.nextDouble();
        
        System.out.println("ENTER INTERATE RATE");
        I=scanner.nextDouble();
        
        System.out.println("ENETR THE NUMBER OF YEARS");
        N=scanner.nextDouble();
        
        A=P* Math.pow(1+(I/100),N);
        
        System.out.println("YOUR ACCUMULATED AMOUNT IS "+A);
        
    }
}
