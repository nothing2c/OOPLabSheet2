public class MessageTest {
    public static void main(String[] args) {

        Message newMessage = new Message();
        Message newerMessage = new Message("Joe Bloggs", "Jim Bloggs", "Hello World");

        newMessage.setRecipient("Fredier");
        newMessage.setSender("Fred");
        newMessage.setContent("Words");

        System.out.println(newMessage.toString()+newerMessage.toString());
    }
}
