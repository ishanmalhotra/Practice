package Implemnataions.ThreadsImpl;

/**
 * Created by ishanmalhotra on 26/4/16.
 */
public class ThreadsUsingThreadClass extends Thread{

    public void run(){
        System.out.println("The Thread is Running");
        System.out.println("The Thread is Daemon " +isDaemon());
        System.out.println("The Thread is " +getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The Thread is " +getName());

    }

    public static void main(String[] aregs){

        ThreadsUsingThreadClass threadsUsingThreadClass=new ThreadsUsingThreadClass();
        threadsUsingThreadClass.start();
        ThreadsUsingThreadClass t2=new ThreadsUsingThreadClass();
        System.out.println("ABCD");

        try {
            threadsUsingThreadClass.join(550000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}
