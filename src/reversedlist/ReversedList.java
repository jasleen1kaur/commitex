/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversedlist;
import java.util.Scanner;
/**
 *
 * @author jasle
 */
public class ReversedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3 steps 1. take i/p word, 2.store each char in array,  3 print word reverse 
       Scanner in = new Scanner(System.in); 
       String word = in.next(); //hello, sheridan
       char[] reverse  = new char[word.length()]; // 5
       for(int i=0;i<word.length();i++) //h e
       {
           reverse[i]=word.charAt(i);
       }
       for(int i=reverse.length-1;i>=0;i--)
       {
           System.out.print(reverse[i]);
       }
    }
    
}
