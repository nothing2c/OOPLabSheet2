public class Books {

    private String title;
    private String ISBN;
    private float price;
    private int numOfPages;

    public Books(){
        this.title="No Title";
        this.ISBN="No ISBN";
        this.price=0f;
        this.numOfPages=0;
    }

    public Books(String title, String ISBN, float price, int numOfPages){
        setTitle(title);
        setISBN(ISBN);
        setPrice(price);
        setNumOfPages(numOfPages);
    }

    public String toString()
    {
        return "Title: "+title+"\nISBN: "+ISBN+"\nPrice: €"+price+"\nNumber Of Pages: "+numOfPages;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN=ISBN;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setPrice(float price)
    {
        this.price=price;
    }

    public float getPrice()
    {
        return price;
    }

    public void setNumOfPages(int numOfPages)
    {
        this.numOfPages=numOfPages;
    }

    public int getNumOfPages()
    {
        return numOfPages;
    }
}
