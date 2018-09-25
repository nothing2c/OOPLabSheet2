import javax.swing.*;

public class BooksExecutable {
    public static void main(String[] args) {

        Books book1 = new Books();

        String title, ISBN, priceStr, numOfPagesStr, errorMessage;
        float price;
        int numOfPages;

        title=JOptionPane.showInputDialog("Please enter the title of Book 1");
        while(!isValidTitle(title))
        {
            title=JOptionPane.showInputDialog("Null entry. Please re-enter the title of Book 1");
        }
        book1.setTitle(title);

        ISBN=JOptionPane.showInputDialog("Please enter the title of "+book1.getTitle());
        errorMessage=validISBN(ISBN);
        while(!errorMessage.equals("success"))
        {
            ISBN=JOptionPane.showInputDialog(errorMessage+"Please re-enter the ISBN of "+book1.getTitle());
            errorMessage=validISBN(ISBN);
        }
        book1.setISBN(ISBN);
        errorMessage="";

        priceStr=JOptionPane.showInputDialog("Please enter the price of "+book1.getTitle());
        errorMessage=validPrice(priceStr);
        while(!errorMessage.equals("success"))
        {
            priceStr=JOptionPane.showInputDialog(errorMessage+"Please re-enter the price of "+book1.getTitle());
            errorMessage=validISBN(ISBN);
        }
        price=Float.parseFloat(priceStr);
        book1.setPrice(price);
        errorMessage="";

        numOfPagesStr=JOptionPane.showInputDialog("Please enter the number of pages of "+book1.getTitle());
        errorMessage=validPrice(priceStr);
        while(!errorMessage.equals("success"))
        {
            numOfPagesStr=JOptionPane.showInputDialog(errorMessage+"Please enter the number of pages of "+book1.getTitle());
            errorMessage=validPrice(priceStr);
        }
        numOfPages=Integer.parseInt(numOfPagesStr);
        book1.setNumOfPages(numOfPages);

        JOptionPane.showMessageDialog(null,book1.toString());

        Books book2 = new Books();
    }

    public static boolean isValidTitle(String title)
    {
        if(title.length()<=0)
            return false;
        else
            return true;
    }

    public static String validISBN(String ISBN)
    {
        if(ISBN.length()<10 || ISBN.length()>13)
            return "Invalid length! Must be between 10 and 13 characters long. ";

        for(int i=0;i<ISBN.length();i++)
        {
            char character=ISBN.charAt(i);

            if(!Character.isLetterOrDigit(character))
                return "ISBN must only contain letters or digits. ";
        }

        return "success";
    }

    public static String validPrice(String price)
    {
        String euros, cents;
        int dot, numOfDots=0, i;

        if(price.length()==0)
            return "Null entry. ";

        for(i=0;i<price.length();i++)
        {
            char character=price.charAt(i);
            if(character=='.')
                numOfDots++;

            else if(!Character.isDigit(character))
                break;
        }

        if(!(i==price.length()&&numOfDots<=1))
            return "Invalid price. Must only contain digits or digits and one period. ";

        if(numOfDots==1)
        {
            dot=price.lastIndexOf('.');
            cents=price.substring(dot,price.length());

            if(cents.length()>2)
                return "Invalid price. cannot exceed 99 after period. ";
            else
                return "success";
        }
        else
            return "success";
    }
}
