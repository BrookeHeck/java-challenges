package codeChallenges.stackQueue;

import dataStructures.Stack.*;

public class Brackets {
    Stack stack;

    public Brackets() {
        this.stack = new Stack();
    }

    private Boolean isOpening(String bracket) {
        if(bracket.equals("[") || bracket.equals("{") || bracket.equals("(")) return true;
        else return false;
    }

    private Boolean bracketsMatch(String opening, String closing) {
        switch(opening) {
            case "{":
                if(closing.equals("}")) return true;
                else return false;
            case "[":
                if(closing.equals("]")) return true;
                else return false;
            case "(":
                if(closing.equals(")")) return true;
                else return false;
            default:
                return false;
        }
    }

    private Boolean isBracket(String str) {
        if(str.equals("{") || str.equals("}") || str.equals("[") || str.equals("]") || str.equals("(") || str.equals(")")) {
            return true;
        } else return false;
    }

    public Boolean isValid(String bracketString) {
        String[] bracketArr = bracketString.split("", 0);
        for(String bracket : bracketArr) {
            if(isBracket(bracket)) {
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
        }
        return true;
    }
}
