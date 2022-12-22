package codeChallenges.stackQueue;

import dataStructures.Stack.*;

public class Brackets {
    Stack stack;

    public Brackets() {
        this.stack = new Stack();
    }

    private Boolean isOpening(String bracket) {
        if(bracket == "[" || bracket == "{" || bracket == "(") return true;
        else return false;
    }

    private Boolean bracketsMatch(String opening, String closing) {
        switch(opening) {
            case "{":
                if(closing == "}") return true;
                else return false;
            case "[":
                if(closing == "]") return true;
                else return false;
            case "(":
                if(closing == ")") return true;
                else return false;
            default:
                return false;
        }
    }

    public Boolean isValid(String bracketString) {
        String[] bracketArr = bracketString.split("", 0);
        for(String bracket : bracketArr) {
            if(isOpening(bracket)) {
                this.stack.push(bracket);
            } else {
                if(this.stack.isEmpty()) return false;
                else {
                    String lastOpeningBracket = this.stack.pop();
                    Boolean doesMatch = bracketsMatch(lastOpeningBracket, bracket);
                    if(!doesMatch) return false;
                }
            }
        }
        return true;
    }
}
