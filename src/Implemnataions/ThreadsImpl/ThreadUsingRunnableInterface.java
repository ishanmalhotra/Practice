package Implemnataions.ThreadsImpl;

/**
 * Created by ishanmalhotra on 26/4/16.
 */
public class ThreadUsingRunnableInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Jai Mata Di");
    }

    public static void main(String[] ar){

        ThreadUsingRunnableInterface threadUsingRunnableInterface=new ThreadUsingRunnableInterface();
        Thread T1=new Thread(threadUsingRunnableInterface);
        T1.start();
    }
}
