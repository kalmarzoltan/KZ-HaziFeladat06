package hazi_6;

public class Main {
    public static void main(String[] args) {
        Termek t1 = new Termek("termek1", 100, 10);
        Kosar kosar1 = new Kosar();

        System.out.println("-------------------------------------------------------");
        kosar1.kosarbaRak(t1);
        kosar1.kosarbaRak(t1);
        kosar1.kosarbaRak(t1);
        kosar1.kosarbaRak(t1);

        kosar1.kosarbolKivesz(t1);
        kosar1.kosarbolKivesz(t1);

        Kosar kosar2 = new Kosar();
        kosar2.kosarbaRak(t1);
        kosar2.kosarbaRak(t1);
        kosar2.kosarbaRak(t1);

        Szemely vasarlo1 = new Vasarlo(args[0], args[1], 31, "email-1", "address-1", kosar1);
        Szemely vasarlo2 = new Vasarlo(args[2], args[3], 45, "email-2", "address-2", kosar2);
        Szemely ugyint1 = new Ugyinezo(args[4], args[5], 41, "123-123", "email-3");
        System.out.println("-------------------------------------------------------");

        kosar1.printKosar();
        kosar2.printKosar();

        System.out.println("-------------------------------------------------------");
        Szemely[] felhasználók = new Szemely[10];
        felhasználók[0] = vasarlo1;
        felhasználók[1] = vasarlo2;
        felhasználók[2] = ugyint1;

        kosar1.kosarbolKivesz(t1);
        kosar2.kosarbolKivesz(t1);
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < felhasználók.length; i++) {
            if (felhasználók[i] != null) {
                System.out.println("Felhasználó "+(i+1)+": "+felhasználók[i].getInformatio());
            }
        }
    }
}
