public class VendingMachine {
    private int numTokens, numCans;

    public VendingMachine()
    {
        this.numCans=0;
        this.numTokens=0;
    }

    public String toString()
    {
        return "Number of cans: "+getNumCans()+"\nNumber of tokens: "+getNumTokens();
    }

    public int getNumTokens() {
        return numTokens;
    }

    public int getNumCans() {
        return numCans;
    }

    public void fillUp(int cans)
    {
        this.numCans+=getNumCans() + cans;
    }

    public void buyCan()
    {
        if(checkCans()==true) {
            numCans--;
            numTokens++;
        }
    }

    private boolean checkCans()
    {
        if(this.numCans>0)
            return true;
        else
            return false;
    }
}
