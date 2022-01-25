package exception;

public class FinallyProgram {
	public static void main(String[] args)
    {
        int a=8,b=0,result=0;
        try
        {
            result = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + result);
        }
    }
}
