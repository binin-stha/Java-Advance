package generics.intermediate.Question4;

public class EmailMessage {
    private String recipientEmail;
    private String subject;
    private String content;

    public EmailMessage(String recipientEmail, String subject, String content) {
        this.content= content;
        this.recipientEmail = recipientEmail;
        this.subject = subject;
    }

//    public String getRecipientEmail() {
//        return recipientEmail;
//    }
//
//    public String getSubject(){
//        return subject;
//    }
//
//    public String getContent() {
//        return content;
//    }

    @Override
    public String toString(){
        return "Email...\nTo: " + recipientEmail + "\nSubject: " + subject + "\nStatus: Delivered" ;
    }
}
