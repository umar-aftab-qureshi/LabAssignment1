import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringPlaindromeTestCases {
    ImplementationClass string=new ImplementationClass();
    @Test
    public void testCase1()
    {
        String exp="String 1 is palindrome";
        String actual=string.palindromeString("ABBA","ADaa");
        Assertions.assertEquals(exp,actual);


    }
    @Test
    public void testCase2()
    {
        String exp="Both Strings are Palindrome";
        String actual=string.palindromeString("ABBA","ABBBBA");
        Assertions.assertEquals(exp,actual);


    }
    @Test
    public void testCase3()
    {
        String exp="Not both strings are Palindrome";
        String actual=string.palindromeString("ABBAr","ABBBvBA");
        Assertions.assertEquals(exp,actual);


    }
    @Test
    public void testCase4()
    {
        String exp="String 2 is palindrome";
        String actual=string.palindromeString("ABBAr","MADAM");
        Assertions.assertEquals(exp,actual);


    }
}
