public class ImplementationClass implements LabAssignment {
    public Boolean IsPrimeNumber(Integer number) {
        //This method will find whetehr the number is prime or not
        if(number==1 || number==2)
        {
            return true;
        }
        else if(number==0 || number<0)
        {
            return false;
        }
        else
        {
            int count=0;
            for(int i=2;i<=number/2;i++)
            {
                if (number%i==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public String NumberCheck(Integer number) {
        //This Function will check whether the number even or odd
        if(number % 2==0)
        {
            return "Even";
        }
        else
        {
            return "Odd";
        }

    }

    public Double Average(Integer[] number) {
        //This method will return the average of the elements that were present in the array..
        double sum=0;
        double avg;
        int length_of_array=number.length;
        for(int i=0;i<number.length;i++)
        {
            sum=sum+number[i];
        }
        avg=sum/length_of_array;
        return avg;
    }

    public String palindromeString(String string1, String string2) {
       if ( isPalindrome(string1) == true && isPalindrome(string2)==true)
       {
           return "Both Strings are Palindrome";
       }
       else if( isPalindrome(string1) == true && isPalindrome(string2)==false)
       {
           return "String 1 is palindrome";
       }
       else if( isPalindrome(string1)==false && isPalindrome(string2)==true)
       {
           return "String 2 is palindrome";
       }
       else
       {
           return "Not both strings are Palindrome";
       }
}
    public boolean isPalindrome(String s) {
        int i=0,j=s.length() -1;
        while( i < j)
        {
            if (s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public Integer Temperature(Integer number) {
        return null;
    }
}
