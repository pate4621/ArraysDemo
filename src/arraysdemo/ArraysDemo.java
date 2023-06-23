/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysdemo;

import java.util.Scanner;
/**
 *
 * @author rajvi
 */
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        //commit 2
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        //commit 1
        for(int i =0;i<myLetters.length;i++){
            myLetters[i]=myWord.charAt(i);
            System.out.print(myLetters[i]);
        }//end of for
        System.out.println();
        System.out.println("printing in reverse");
        for(int i =myLetters.length-1;i>=0;i--){
            System.out.print(myLetters[i]);
        }//end of for
    }//end of main
    
}
    
    

