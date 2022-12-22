import codeChallenges.stackQueue.BrowserHistory;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        System.out.println(browserHistory.isValid("{}()[]"));
        System.out.println(browserHistory.isValid("{}{code}(Fellows)[[]]"));
        System.out.println(browserHistory.isValid("{(})"));
        System.out.println(browserHistory.isValid("[(]"));
    }
}