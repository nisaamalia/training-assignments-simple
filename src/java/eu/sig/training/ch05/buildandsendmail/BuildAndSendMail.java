package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag build and send email
    public void buildAndSendMail(MailMan m, String firstName, String lastName,
        String division, String subject, MailFont font, String message1,
        String message2, String message3) {
        // Format the email address
        String mId = firstName.charAt(0) + "." + lastName.substring(0, 7) + "@"
            + division.substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(font,
            message1 + message2 + message3);
        // Send message
       // m.send(mId, subject, mMessage);
        MailMan mMan = send(mId, subject, mMessage);
    }
    // end

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }
    
    @SuppressWarnings("unused")
    private MailMan send(String mId, String subject, MailMessage mMessage) {
    	return null;
    }

    private class MailFont {

    }

    private class MailMessage {

    }
    
    private class MailMan{
    
    }

}