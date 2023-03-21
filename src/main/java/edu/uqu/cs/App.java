package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;
public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 


    /**
     * @param args the command line arguments
     */


    public static void twisters() {

        for (int L = 1; L <= 110; L++) {

            if (L % 2 == 0) {
                System.out.print("Tweetle");

                if (L % 4 == 0) {
                    System.out.print("Beetle");
                }

                if (L % 6 == 0) {
                    System.out.print("Poodle");
                }
            }
            else {
                System.out.print(" " + L + " ");
            }
        }
    }

    public static void phoneKeypad(String text) {

        // this String var will hold the result
        // it's String and not int so that when adding numbers 
        // they are added next to each other and not math addition
        String r = "";
        
        // loop for each char in the text
        for (char ch : text.toUpperCase().toCharArray()) {
            // switch case for each 3 letters
            switch (ch) {
                case 'A':
                case 'B':
                case 'C':
                    r += "2";
                    break;
                case 'D':
                case 'E':
                case 'F':
                    r += "3";
                    break;
                case 'G':
                case 'H':
                case 'I':
                    r += "4";
                    break;
                case 'J':
                case 'K':
                case 'L':
                    r += "5";
                    break;
                case 'M':
                case 'N':
                case 'O':
                    r += "6";
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    r += "7";
                    break;
                case 'T':
                case 'U':
                case 'V':
                    r += "8";
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    r += "9";
                    break;
            }
        }

        System.out.println(r);
    }

    public static void main(String [] args) {

        twisters();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string >> ");
        phoneKeypad(scan.nextLine());

    }

}

    
        
     
