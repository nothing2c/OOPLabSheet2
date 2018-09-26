public class BookValidation {

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
        String cents;
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
            cents=price.substring(dot+1,price.length());

            if(cents.length()>2)
                return "Invalid price. cannot exceed 99 after period. ";
            else
                return "success";
        }
        else
            return "success";
    }

    public static String validPages(String pages)
    {
        int i;

        if(pages.length()==0)
            return "Null entry";

        for(i=0;i<pages.length();i++)
        {
            if(!Character.isDigit(pages.charAt(i)))
                return "Invalid entry. Number must be all digits. ";
        }

        return "success";
    }
}
