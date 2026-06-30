class BrowserHistory {
    private String[] history;
    int current;
    int end; 
    int maxSize;
       public BrowserHistory(String homepage) {
        maxSize = 5001;
        history = new String[maxSize];
        history[0] = homepage;
        current = 0;
        end = 0;
    }
    public void visit(String url) {
        current++;
        history[current] = url;
        end = current;
    }
    public String back(int steps) {
       current = Math.max(0, current - steps); 
        return history[current];
    }
       public String forward(int steps) {
         int potentialNewCurrent = current + steps;
        if (potentialNewCurrent > end) {
              current = end;
        } else {
             current = potentialNewCurrent;
                   }
        return history[current];
    }
}