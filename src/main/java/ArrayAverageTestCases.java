import org.junit.gen5.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayAverageTestCases {
    ImplementationClass arrayAvg=new ImplementationClass();
    @BeforeEach
    public void print()
    {
        System.out.println("These test cases will compare the actual and expected output:");
    }
    @Test
    public void TestCase1()
    {
        double exp=3.0;
        Integer array[]={1,2,3,4,5};
        double actual=arrayAvg.Average(array);
        Assertions.assertEquals(exp,actual);
    }
    @Test
    public void TestCase2()
    {
        double exp=5.0;
        Integer array[]={5,5,5,5,5};
        double actual=arrayAvg.Average(array);
        Assertions.assertEquals(exp,actual);
    }

}
