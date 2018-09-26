public class Message {

    private String recipient, sender, content;

    public Message(){
        this.recipient="Unknown";
        this.sender="Unknown";
        this.content="Empty";
    }

    public Message(String recipient, String sender, String content){
        setRecipient(recipient);
        setSender(sender);
        setContent(content);
    }

    public String toString()
    {
        return "\nTo: "+recipient+"\nFrom: "+sender+"\n\nContent:\n\n"+content;
    }

    public void setRecipient(String recipient)
    {
        this.recipient=recipient;
    }

    public String getRecipient()
    {
        return recipient;
    }

    public void setSender(String sender)
    {
        this.sender=sender;
    }

    public String getSender()
    {
        return sender;
    }

    public void setContent(String content)
    {
        this.content=content;
    }

    public String getContent()
    {
        return content;
    }
}
