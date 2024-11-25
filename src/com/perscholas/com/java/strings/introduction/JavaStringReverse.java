package com.perscholas.com.java.strings.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaStringReverse {

    public void stringReverseTest() {

        //Variables
        String scannedString;
        String reversedString;
        //ArrayList<String> scannedStringArray = new ArrayList<>();
        String[] scannedStringArray;
        ArrayList<String> reversedStringArrayList = new ArrayList<>();
        //String[] reversedStringArray = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with up to 50 lowercase characters: ");
        scannedString = scanner.nextLine();
        while (scannedString.length() > 50) {
            System.out.println("Please re-enter a string with up to 50 lowercase characters: ");
            scannedString = scanner.nextLine();
        }

        scannedStringArray = scannedString.split("");

        for (int i = scannedStringArray.length - 1; i >= 0; i--) {
            reversedStringArrayList.add(scannedStringArray[i]);
        }

        reversedString = String.join("", reversedStringArrayList);

//        System.out.println("Scanned String Array: " + Arrays.toString(scannedStringArray));
//        System.out.println("Reversed String ArrayList: " + reversedStringArrayList);
//        System.out.println("Reversed String: " + reversedString);
//        System.out.println("Scanned String: " + scannedString);

        if (reversedString.equals(scannedString)) {
            System.out.println();
            System.out.println(scannedString + " is a palindrome.");

        } else {
            System.out.println();
            System.out.println(scannedString + " is not a palindrome.");
        }

        //scanner.close(); this seem to error unless we only close it at the very end of all called methods in Main
    }
}
