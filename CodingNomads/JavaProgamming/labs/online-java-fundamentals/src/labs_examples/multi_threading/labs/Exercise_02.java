package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_02 {
    public static void main(String[] args) {
        Thread newThread = new ExtendsThread();
        newThread.start();
    }
}

class ExtendsThread extends Thread {

    public ExtendsThread () {
        super();
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName());
    }
}
