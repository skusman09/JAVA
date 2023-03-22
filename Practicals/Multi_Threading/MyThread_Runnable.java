// MyThread Implements "Runnable" Interface

package Multi_Threading;

public class MyThread_Runnable implements Runnable {

    @Override
    public void run() {
        System.out.println("MyThread Implements Runnable Interface");
    }
    public static void main(String[] args) {
        MyThread_Runnable myThread = new MyThread_Runnable();
        Thread thread = new Thread(myThread);

        thread.start();
    }

}
