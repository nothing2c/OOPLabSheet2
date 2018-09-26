import javax.swing.*;

public class BooksExecutable {
    public static void main(String[] args) {

        Books book1 = new Books();
        Books book2 = new Books();

        Books bookList[] = {book1, book2};

        String title, ISBN, priceStr, numOfPagesStr, errorMessage;
        float price;
        int numOfPages;

        for(int i=0;i<2;i++) {
            title = JOptionPane.showInputDialog("Please enter the title of Book "+(i+1));
            while (!BookValidation.isValidTitle(title)) {
                title = JOptionPane.showInputDialog("Null entry. Please re-enter the title of Book "+(i+1));
            }
            bookList[i].setTitle(title);

            ISBN = JOptionPane.showInputDialog("Please enter the ISBN of " + bookList[i].getTitle());
            errorMessage = BookValidation.validISBN(ISBN);
            while (!errorMessage.equals("success")) {
                ISBN = JOptionPane.showInputDialog(errorMessage + "Please re-enter the ISBN of " + bookList[i].getTitle());
                errorMessage = BookValidation.validISBN(ISBN);
            }
            bookList[i].setISBN(ISBN);
            errorMessage = "";

            priceStr = JOptionPane.showInputDialog("Please enter the price of " + bookList[i].getTitle());
            errorMessage = BookValidation.validPrice(priceStr);
            while (!errorMessage.equals("success")) {
                priceStr = JOptionPane.showInputDialog(errorMessage + "Please re-enter the price of " + bookList[i].getTitle());
                errorMessage = BookValidation.validPrice(priceStr);
            }
            price = Float.parseFloat(priceStr);
            bookList[i].setPrice(price);
            errorMessage = "";

            numOfPagesStr = JOptionPane.showInputDialog("Please enter the number of pages of " + bookList[i].getTitle());
            errorMessage = BookValidation.validPages(numOfPagesStr);
            while (!errorMessage.equals("success")) {
                numOfPagesStr = JOptionPane.showInputDialog(errorMessage + "Please enter the number of pages of " + bookList[i].getTitle());
                errorMessage = BookValidation.validPages(numOfPagesStr);
            }
            numOfPages = Integer.parseInt(numOfPagesStr);
            bookList[i].setNumOfPages(numOfPages);
            errorMessage = "";
        }

        JOptionPane.showMessageDialog(null, book1.toString()+book2.toString());
    }
}
