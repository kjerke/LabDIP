/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author kevinjerke
 */
public class MessageReader implements Input {
   public String readln(){
       System.out.println("Enter message");
       
       Scanner keyboard = new Scanner(System.in);
       return keyboard.nextLine();
   }
}
