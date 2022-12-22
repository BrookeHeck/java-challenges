import codeChallenges.stackQueue.BrowserHistory;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.changePage("www.one.com");
        browserHistory.changePage("www.two.com");
        browserHistory.changePage("www.three.com");

        System.out.println(browserHistory.toString());

        browserHistory.goBack();
        
        System.out.println(browserHistory.toString());

        browserHistory.goForward();
        
        System.out.println(browserHistory.toString());
    }
}