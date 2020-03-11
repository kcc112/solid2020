package pl.zzpj2020.solid.isp.contactbook.solution;

public interface Emailer {
    void sendMessage(String mail, String subject, String body);
}
