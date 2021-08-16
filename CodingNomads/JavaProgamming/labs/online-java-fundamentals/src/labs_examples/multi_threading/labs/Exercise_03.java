package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

class Exercise_03 {
    public static void main(String[]args){
        ThreadExample4 example4 = new ThreadExample4("first thread");

        Thread example3 = new Thread(new ThreadExample3());
        example3.setPriority(Thread.NORM_PRIORITY - 1);
        example3.start();
    }
}

class ThreadExample3 implements Runnable {
    @Override
    public void run() {
        System.out.println("running " + Thread.currentThread().getName());
    }
}

class ThreadExample4 implements Runnable {

    Thread thread;

    public ThreadExample4(String threadName) {
        thread = new Thread(this, threadName);
        thread.setPriority(Thread.NORM_PRIORITY + 1);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("running " + thread.getName());
    }
}


