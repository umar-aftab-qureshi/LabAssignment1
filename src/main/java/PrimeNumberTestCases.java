import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PrimeNumberTestCases {
    ImplementationClass  primeNumber=new ImplementationClass();

    @BeforeEach
    public void print()
    {
        System.out.println("These test cases are developed to check the code of prime number");
    }
    @Test
    public void isPrime()
    {
        Boolean exp=true;

        Boolean actual=primeNumber.IsPrimeNumber(1);

        Assertions.assertEquals(actual,exp,"Not found");

    }
    @Test
    public void isPrime1  ()
    {
        Boolean exp=false;

        Boolean actual=primeNumber.IsPrimeNumber(4);
        Assertions.assertEquals(actual,exp,"Not found");


    }
    @Test
    public void isPrime2()
    {
        Boolean exp=true;
        Boolean actual=primeNumber.IsPrimeNumber(17);
        Assertions.assertEquals(actual,exp,"Not found");

    }
    @Test
    public void isPrime3()
    {
        Boolean exp=false;
        Boolean actual=primeNumber.IsPrimeNumber(-3);
        Assertions.assertEquals(actual,exp,"Not found");

    }
    @Test
    public void isPrime4()
    {
        Boolean exp=false;
        Boolean actual=primeNumber.IsPrimeNumber(18);
        Assertions.assertEquals(actual,exp,"Not found");

    }

}
