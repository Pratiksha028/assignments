package elearnings;
interface Animals 
{  
    default void show() 
    { 
        System.out.println("This is animals class"); 
    } 
} 
interface Plants 
{  
    default void show() 
    { 
        System.out.println("This is plants class"); 
    } 
} 
public class DiamondProblem implements Animals, Plants 
{  
    public void show() 
    {  
        Animals.super.show(); 
        Plants.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        DiamondProblem dp = new DiamondProblem(); 
        dp.show(); 
    } 


}
