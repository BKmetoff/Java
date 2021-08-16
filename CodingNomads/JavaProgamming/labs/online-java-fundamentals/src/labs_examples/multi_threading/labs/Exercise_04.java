package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:*
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Exercise_04 {
    public static void main(String[] args) {
        MessageSender senderOne = new MessageSender();

        ListeningThread thread1 = new ListeningThread("message to thread one", senderOne);
        ListeningThread thread2 = new ListeningThread("message to thread two", senderOne);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}

class ListeningThread extends Thread {
    private String incomingMessage;
    private Thread thread;
    private MessageSender sender;

    public ListeningThread(String incomingMessage, MessageSender sender) {
        this.incomingMessage = incomingMessage;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender) {
            sender.sendMessage(incomingMessage);
        }
    }
}

class MessageSender {
    public MessageSender(){}

    public void sendMessage (String message) {
        System.out.println("sending: " + message);
        System.out.println("message sent!");
    }
}