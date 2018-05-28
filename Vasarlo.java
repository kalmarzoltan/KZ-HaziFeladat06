package hazi_6;

public class Vasarlo extends Szemely {
    private String address;
    private Kosar kosar;

    public Vasarlo(String vezetekNev, String keresztNev, int eletkor, String email, String address, Kosar kosar) {
        super(vezetekNev, keresztNev, eletkor, email);
        this.address = address;
        this.kosar = kosar;
    }

    @Override
    public String getInformatio() {

        return "Vásárló neve: " + this.getVezetekNev() + " " + this.getKeresztNev() + ", Eletkor: " + this.getEletkor()
                + ", email: " + this.getEmail() + ", address: " + this.address + ", a kosárban van: " + kosar.kosarbanLevoTermekekSzama() + " db termék";
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Kosar getKosar() {
        return kosar;
    }

    public void setKosar(Kosar kosar) {
        this.kosar = kosar;
    }

}
