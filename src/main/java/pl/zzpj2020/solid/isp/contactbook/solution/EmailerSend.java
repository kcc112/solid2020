package pl.zzpj2020.solid.isp.contactbook.solution;

public interface EmailerSend {
     void sendMessage(Contact emailable, String subject, String body);
     void sendEmail(String emailAddress, String subject, String body);
}
