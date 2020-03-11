package pl.zzpj2020.solid.isp.contactbook.solution;

public class ContactEmail extends Contact implements Emailer {

    private String email;

    public ContactEmail(String name, String address, String email) {
        super(name, address);
        this.email = email;
    }

    @Override
    public void sendMessage(String mail, String subject, String body) {
    }
}
