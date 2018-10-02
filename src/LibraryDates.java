import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LibraryDates {
    public static void main(String[] args) {
        GregorianCalendar borrowDate, returnDate;
        SimpleDateFormat f1 = new SimpleDateFormat("EEEE MMMM dd'th', yyyy");

        String borrowDayS, borrowMonthS, borrowYearS, returnDayS, returnMonthS, returnYearS;
        int borrowDay, borrowMonth, borrowYear, returnDay, returnMonth, returnYear;

        borrowDayS=JOptionPane.showInputDialog("Please enter the day you borrowed the book");
        borrowDay=Integer.parseInt(borrowDayS);

        borrowMonthS=JOptionPane.showInputDialog("Please enter the month you borrowed the book");
        borrowMonth=Integer.parseInt(borrowMonthS);

        borrowYearS=JOptionPane.showInputDialog("Please enter the year you borrowed the book");
        borrowYear=Integer.parseInt(borrowYearS);

        returnDayS=JOptionPane.showInputDialog("Please enter the day you returned the book");
        returnDay=Integer.parseInt(returnDayS);

        returnMonthS=JOptionPane.showInputDialog("Please enter the month you returned the book");
        returnMonth=Integer.parseInt(returnMonthS);

        returnYearS=JOptionPane.showInputDialog("Please enter the year you returned the book");
        returnYear=Integer.parseInt(returnYearS);

        borrowDate = new GregorianCalendar(borrowYear,borrowMonth-1, borrowDay);
        returnDate = new GregorianCalendar(returnYear,returnMonth-1,returnDay);

        int daysBorrowed = returnDate.get(Calendar.DAY_OF_YEAR)-borrowDate.get(Calendar.DAY_OF_YEAR);

        JOptionPane.showMessageDialog(null, "Return Date: "+f1.format(borrowDate.getTime())+
                                      "\nDate: "+f1.format(returnDate.getTime())+"\nDays book was borrowed: "+daysBorrowed);
    }
}
