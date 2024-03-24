package com.MTH;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int inputSeconds = scanner.nextInt();

        int hours = inputSeconds / 3600;
        int remainingSeconds = inputSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println("Expected output:");
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
