import org.junit.gen5.api.BeforeAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EvenOddTestCases {
ImplementationClass numberChecker=new ImplementationClass();
@BeforeEach
    public void print()
{
    System.out.println("These test cases are developed to check the number:");
}
@Test
    public void testCase1()
{
    String exp="Even";
    String actual=numberChecker.NumberCheck(2);
    Assertions.assertEquals(actual,exp);
}
    @Test
    public void testCase2()
    {
        String exp="Odd";
        String actual=numberChecker.NumberCheck(1);
        Assertions.assertEquals(actual,exp);
    }
    @Test
    public void testCase3()
    {
        String exp="Even";
        String actual=numberChecker.NumberCheck(8);
        Assertions.assertEquals(actual,exp);
    }
    @Test
    public void testCase4()
    {
        String exp="Even";
        String actual=numberChecker.NumberCheck(98);
        Assertions.assertEquals(actual,exp);
    }
    @Test
    public void testCase5()
    {
        String exp="Odd";
        String actual=numberChecker.NumberCheck(199);
        Assertions.assertEquals(actual,exp);
    }
}
