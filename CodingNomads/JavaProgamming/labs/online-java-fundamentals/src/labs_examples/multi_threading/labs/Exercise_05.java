package labs_examples.multi_threading.labs;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Multithreading Exercise 5:
 *      Demonstrate the use of a wait() and notify()
 */

class Exercise_05 {
    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new MessageSenderThread(data));
        Thread recipient = new Thread(new MessageRecipientThread(data));

        sender.start();
        recipient.start();
    }
}


class MessageRecipientThread implements Runnable {
    private Data data;

    public MessageRecipientThread(Data data){
        this.data = data;
    }

    @Override
    public void run() {
        for (String receivedMessage = data.receive();
             !"stop".equals(receivedMessage);
             receivedMessage = data.receive())
        {
            System.out.println(receivedMessage);
        }
    }
}

class MessageSenderThread implements Runnable {
    private Data data;

    public MessageSenderThread(Data data){
        this.data = data;
    }

    @Override
    public void run() {
        String[] messages = {"one", "two", "three", "four", "stop"};

        for (String message : messages) {
            data.send(message);
        }
    }
}

class Data {
    private String message;
    private boolean isSending = true;

    public Data(){}

    public synchronized void send (String messageToBeSent) {
        while (!isSending) {
            try {
                wait();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

        isSending = false;

        this.message = messageToBeSent;
        notifyAll();
    }

    public synchronized String receive() {
        while (isSending) {
            try {
                wait();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

        isSending = true;
        notifyAll();
        return message;
    }
}