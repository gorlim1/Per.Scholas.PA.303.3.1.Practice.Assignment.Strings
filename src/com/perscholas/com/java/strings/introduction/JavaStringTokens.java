package com.perscholas.com.java.strings.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

    String scannedString;
    String[] scannedStringArray;
    Scanner scanner = new Scanner(System.in);

    public void stringTokensTest() {

        scannedString = scanner.nextLine();
        while (scannedString.length() < 1 || scannedString.length() > 4 * Math.pow(10, 5)) {
            scannedString = scanner.nextLine();
        }

        scannedString = scannedString.trim(); //why is this not the same as in the above?
        //System.out.println("Scanned String trimmed: " + scannedString.isEmpty());

        if (scannedString.isEmpty()) {

            System.out.println("0");

        } else {

            scannedStringArray = scannedString.split("[ !,?._'@]+");
            //System.out.println(Arrays.toString(scannedStringArray));
            System.out.println(scannedStringArray.length);
            //System.out.println("Array: " + Arrays.toString(scannedStringArray));
            //System.out.println(scannedStringArray);

            for (int i = 0; i < scannedStringArray.length; i++) {
                //System.out.println("i is " + i);
                System.out.println(scannedStringArray[i]);
            }
        }

        scanner.close(); //this seem to error unless we only close it at the very end of all called methods in Main

    }
}
