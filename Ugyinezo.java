package hazi_6;

public class Ugyinezo extends Szemely {
    private String telSzam;


    public Ugyinezo(String vezetekNev, String keresztNev, int eletkor, String telSzam, String email) {
        super(vezetekNev, keresztNev, eletkor, email);
        this.telSzam = telSzam;

    }

    @Override
    public String getInformatio() {
        return "Ugyintezo neve: " + this.getVezetekNev() + " " + this.getKeresztNev() + ", Eletkor: " + this.getEletkor()
                + ", email: " + this.getEmail()+", Tel: "+this.telSzam;
    }

    public String getTelSzam() {
        return telSzam;
    }

    public void setTelSzam(String telSzam) {
        this.telSzam = telSzam;
    }


}
