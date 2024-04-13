/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.muoh;

import java.util.Scanner;
/**
 *
 * @author EPHRAIM MAANDA
 */
public class Muoh {

    public static void main(String[] args) {
                 Scanner values= new Scanner(System.in);
    int NUMBER1;
    int NUMBER2;
    int DIFFERANCE;
    System.out.println("ENTER YOUR INTIAL NUMBER");
    NUMBER1 = values.nextInt();
     System.out.println("ENTER YOUR FINAL NUMBER");
     NUMBER2=values.nextInt();
     
     DIFFERANCE=NUMBER2-NUMBER1;
     System.out.println("YOUR ANSWER IS"+DIFFERANCE);
     
    }
}
