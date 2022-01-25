package Threadpackage;

public class RunnableThreadProgram implements Runnable {
    public static int myCount = 0;
    public RunnableThreadProgram(){
         
    }
    public void run() {
        while(RunnableThreadProgram.myCount <= 5){
            try{
                System.out.println("Expl Thread: "+(++RunnableThreadProgram.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        RunnableThreadProgram mrt = new RunnableThreadProgram();
        Thread t = new Thread(mrt);
        t.start();
        while(RunnableThreadProgram.myCount <= 5){
            try{
                System.out.println("Main Thread: "+(++RunnableThreadProgram.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
    }

