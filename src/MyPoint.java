public class MyPoint {

    private int xVal, yVal;

    public MyPoint()
    {
        this.xVal=0;
        this.yVal=0;
    }

    public MyPoint(int x, int y)
    {
        setXVal(x);
        setYVal(y);
    }

    public String toString()
    {
        return Integer.toString(getXVal())+", "+Integer.toString(getYVal());
    }

    public void moveHorizontally(int x)
    {
        this.xVal+=x;
    }

    public void moveVertically(int y)
    {
        this.yVal+=y;
    }

    public void translate(int x, int y)
    {
        this.xVal+=x;
        this.yVal+=y;
    }

    public double distanceFromOrigin(int x, int y)
    {
        return Math.sqrt(Math.pow(0-x,2)+(Math.pow(0-y,2)));
    }

    public void setXVal(int x)
    {
        this.xVal=x;
    }

    public int getXVal()
    {
        return xVal;
    }

    public void setYVal(int y)
    {
        this.yVal=y;
    }

    public int getYVal()
    {
        return yVal;
    }
}
