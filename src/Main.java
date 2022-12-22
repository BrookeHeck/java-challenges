import codeChallenges.stackQueue.Brackets;

public class Main {
    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        System.out.println(brackets.isValid("{}()[]"));
        System.out.println(brackets.isValid("{}{code}(Fellows)[[]]"));
        System.out.println(brackets.isValid("{(})"));
        System.out.println(brackets.isValid("[(]"));
    }
}