/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // inputs 1 and 2 ask the user for their quote and author, which is then concatonated in line 19
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String inputQuote = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Who said it? ");
        String inputAuthor = input2.nextLine();
        
        System.out.println(inputAuthor + " says, " + "\"" + inputQuote + "\"");
    }
}