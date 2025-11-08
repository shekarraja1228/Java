package com.pck.vector;

import java.util.Vector;

class VectorWorker extends Thread {
    private Vector<Integer> sharedVector;

    public VectorWorker(Vector<Integer> vector) {
        this.sharedVector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedVector.add(i);
            System.out.println(Thread.currentThread().getName() + " added: " + i);
        }
    }
}

public class VectorThreadExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        Thread t1 = new VectorWorker(vector);
        Thread t2 = new VectorWorker(vector);

        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Vector: " + vector);
    }
}

