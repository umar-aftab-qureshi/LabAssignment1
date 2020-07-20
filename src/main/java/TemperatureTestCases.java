import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureTestCases {
    ImplementationClass temp=new ImplementationClass();
    //these test cases are design to check temperature from celsius to Farhenheit
    @Test
    public void testCase1()
    {
        double exp=32.0;
        double actual=temp.TemperatureToFahrenheit(0);
        Assertions.assertEquals(exp,actual);
    }
    @Test
    public void testCase2()
    {
        double exp=89.6;
        double actual=temp.TemperatureToFahrenheit(32);
        Assertions.assertEquals(exp,actual);
    }
    @Test
    public void testCase3()
    {
        double exp=248;
        double actual=temp.TemperatureToFahrenheit(120);
        Assertions.assertEquals(exp,actual);
    }
    //Now th
}
