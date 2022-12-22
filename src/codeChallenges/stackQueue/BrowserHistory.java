package codeChallenges.stackQueue;

import dataStructures.Stack.*;

public class BrowserHistory {
    Stack previous;
    Stack forward;
    
    String current;

    public BrowserHistory() {
        this.previous = new Stack();
        this.forward = new Stack();
        this.current = "";
    }

    public void changePage(String currentUrl) {
        this.previous.push(this.current);
        this.current = currentUrl;
    }

    public String goBack() {
        String temp = this.current;
        this.forward.push(temp);
        this.current = this.previous.pop();
        return temp;
    }

    public String goForward() {
        String temp = this.current;
        this.previous.push(temp);
        this.current = this.forward.pop();
        return temp;
    }

    public String getStackStrings(Stack stack) {
        Stack tempStack = new Stack();
        String str = "";
        while(!stack.isEmpty()) {
            String tempStr = stack.pop();
            str = str + tempStr + " ";
            tempStack.push(tempStr);
        }
        while(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return str;
    }

    @Override
    public String toString() {
        return "PREVIOUS: " + getStackStrings(this.previous) + "CURRENT: " + this.current + " FORWARD: " + getStackStrings(this.forward);
    }
}
