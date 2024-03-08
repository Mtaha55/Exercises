package com.MTH;


import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's input as a String
        String username = scanner.nextLine();

        // Print the greeting with the entered username
        System.out.println("Hello " + username + "!");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
