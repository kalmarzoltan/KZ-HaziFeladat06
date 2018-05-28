package hazi_6;

public abstract class Szemely {
    private final String vezetekNev;
    private final String keresztNev;
    private final int eletkor;
    private String email;

    public Szemely(String vezetekNev, String keresztNev, int eletkor, String email) {
        this.vezetekNev = vezetekNev;
        this.keresztNev = keresztNev;
        this.eletkor = eletkor;
        this.email = email;
    }

    public String getVezetekNev() {
        return vezetekNev;
    }

    public String getKeresztNev() {
        return keresztNev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getInformatio();
}
