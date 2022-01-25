package exception;

public class ThrowProgram {
    public static void main(String[] args)
    {
        int a=7,b=0,result;
        try
        {
            if(b==0)        
                throw(new ArithmeticException("divide by zero not possible."));
            else
            {
                result = a / b;
                System.out.print("\n\tThe result is : " + result);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
    }
}
