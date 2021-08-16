package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:*
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class Exercise_06 {
    public static void main(String[] args) {
        NumberProcessor numberProcessor = new NumberProcessor(2, 100);

        Thread thread1 = new Thread(new PrintNumber(numberProcessor, 1));
        Thread thread2 = new Thread(new PrintNumber(numberProcessor, 0));

        thread1.start();
        thread2.start();

    }
}

class PrintNumber implements Runnable {

    private final int oddOrEvenNumberToPrint;
    private final NumberProcessor processor;

    public PrintNumber(NumberProcessor processor, int oddOrEvenNumberToPrint){
        this.processor = processor;
        this.oddOrEvenNumberToPrint = oddOrEvenNumberToPrint;
    }

    @Override
    public void run(){
        processor.printNumbers(oddOrEvenNumberToPrint);
    }
}

class NumberProcessor {
    private int currentNumber = 1;
    private final int endOfSequence;
    private final int numberOfThreads;

    public NumberProcessor(int numberOfThreads, int endOfSequence){
        super();
        this.numberOfThreads = numberOfThreads;
        this.endOfSequence = endOfSequence;
    }

    public void printNumbers(int oddOrEvenNumberToPrint) {
        synchronized (this) {
            while (currentNumber < endOfSequence) {
                while (currentNumber % numberOfThreads != oddOrEvenNumberToPrint) {
                    try {
                        wait();
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }

                }
                System.out.println(Thread.currentThread().getName() + " " + currentNumber++);
                notifyAll();
            }
        }
    }
}