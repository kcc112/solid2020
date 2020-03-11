package pl.zzpj2020.solid.isp.contactbook.solution;

public class ContactDialler extends Contact implements Dialler {

    private String phoneNumber;

    public ContactDialler(String name, String address, String phoneNumber) {
        super(name, address);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void makeCall(String phoneNumber) {
    }
}
