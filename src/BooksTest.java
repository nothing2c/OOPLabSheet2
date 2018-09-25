public class BooksTest {
    public static void main(String[] args) {

        Books book1 = new Books();
        Books book2 = new Books("HP","sdfsd",22.56f,200);

        book1.setTitle("not HP");
        book1.setISBN("retraced");
        book1.setPrice(50.12f);
        book1.setNumOfPages(50);

        System.out.println(book1.toString());
        System.out.println("\nTitle: "+book2.getTitle()+"\nISBN: "+book2.getISBN()+"\nPrice: "+book2.getPrice()+
                           "\nNumber Of Pages: "+book2.getNumOfPages());
    }
}
