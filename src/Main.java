import com.perscholas.com.java.strings.introduction.*;

public class Main {
    public static void main(String[] args) {

        //Running the class methods
        JavaStringsIntroduction stringMethods = new JavaStringsIntroduction();
        stringMethods.stringMethodsTest();

        JavaSubstring substringMethods = new JavaSubstring();
        substringMethods.stringSubstringTest();

        JavaSubstringComparisons substringComparisons = new JavaSubstringComparisons();
        substringComparisons.substringComparisonsTest();

        JavaStringReverse stringReverse = new JavaStringReverse();
        stringReverse.stringReverseTest();

        JavaStringTokens stringTokens = new JavaStringTokens();
        stringTokens.stringTokensTest();
    }

    //scanner.close(); this seem to error unless we only close it at the very end of all called methods in Main
}