// Thread Extends "Thread" Pre_Define-Class

package Multi_Threading;

public class MyThread_Thread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("MyThread Extends Thread PreDifine-Class");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

        MyThread_Thread mt = new MyThread_Thread();
        mt.start();

        MyThread_Thread mt1 = new MyThread_Thread();
        mt1.start();
    }

}
