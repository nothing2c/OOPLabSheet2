public class VendingMachine {
    private int numTokens, numCans;

    public VendingMachine()
    {
        setNumTokens(0);
        setNumCans(0);
    }

    public void setNumTokens(int numTokens) {
        this.numTokens = numTokens;
    }

    public int getNumTokens() {
        return numTokens;
    }

    public void setNumCans(int numCans) {
        this.numCans = numCans;
    }

    public int getNumCans() {
        return numCans;
    }
}
