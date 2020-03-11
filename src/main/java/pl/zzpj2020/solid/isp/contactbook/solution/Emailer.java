package pl.zzpj2020.solid.isp.contactbook.solution;

public class Emailer implements EmailerSend {
    public void sendMessage(Contact emailable, String subject, String body) {

        String emailAddress = emailable.getEmailAddress();

        sendEmail(emailAddress, subject, body);
    }

    public void sendEmail(String emailAddress, String subject, String body) {
        // TODO Auto-generated method stub
    }
}
