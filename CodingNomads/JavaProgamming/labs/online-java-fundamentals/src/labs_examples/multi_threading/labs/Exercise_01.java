package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 */

class Exercise_01 {
    public static void main(String[]args){
        ThreadExample1 example1 = new ThreadExample1("first thread");
        Thread example2 = new Thread(new ThreadExample2());
        example2.start();
    }
}

class ThreadExample2 implements Runnable {
    @Override
    public void run() {
        System.out.println("running " + Thread.currentThread().getName());
    }
}

class ThreadExample1 implements Runnable {

    Thread thread;

    public ThreadExample1(String threadName) {
        thread = new Thread(this, threadName);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("running " + thread.getName());
    }
}

