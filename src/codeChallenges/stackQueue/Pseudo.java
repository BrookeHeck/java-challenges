package codeChallenges.stackQueue;

import dataStructures.Stack.Stack;

public class Pseudo {
    Stack queue;
    Stack temp;

    public Pseudo() {
        this.queue = new Stack();
        this.temp = new Stack();
    }

    private void reset() {
        while(!this.temp.isEmpty()) {
            this.queue.push(this.temp.pop());
        }
    }

    public void enquue(String str) {
        while(!this.queue.isEmpty()) {
            this.temp.push(this.queue.pop());
        }
        this.queue.push(str);
        reset();
    }

    public String dequeue() {
        return this.queue.pop();
    }
}
