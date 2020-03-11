package pl.zzpj2020.solid.isp.contactbook.solution;

public class Dialer implements DiallerCall {

    public void makeCall(Contact dialable) {
        String telephone = dialable.getTelephone();
    }
}
