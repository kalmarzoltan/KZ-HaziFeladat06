package hazi_6;

public class Kosar implements KosarInterface {
    private Termek[] kosarArray = new Termek[10];

//    @Override
//    public void kosarbaRak(Termek termek) {
//        int termekekSzama = 0;
//        for (int i = 0; i < kosarArray.length; i++) {
//            if (kosarArray[i] != null) {
//                termekekSzama++;
//            }
//        }
//        if (termekekSzama >= kosarArray.length) {
//            System.out.println("A kosár tele van: " + termekekSzama + " db Termék van benne");
//        } else {
//            kosarArray[termekekSzama] = termek;
//            System.out.println("A " + termek.getName() + " a kosárba került");
//            termekekSzama++;
//            System.out.println("Vásárlás után a kosárban lévő termékek száma: " + termekekSzama);
//        }
//    }

//    @Override
//    public void kosarbolKivesz(Termek termek) {
//        int termekekSzama = 0;
//        for (int i = 0; i < kosarArray.length; i++) {
//            if (kosarArray[i] != null) {
//                termekekSzama++;
//            }
//        }
//        if (termekekSzama == 0) {
//            System.out.println("Nincs is semmi a kosárban!!");
//        }
//        for (int i = 0; i < kosarArray.length; i++) {
//            if (kosarArray[i] == termek) {
//                kosarArray[i] = null;
//                System.out.println("A " + termek.getName() + " kikerült a kosárból");
//                termekekSzama--;
//                System.out.println("Vásárlás után a kosárban lévő termékek száma: " + termekekSzama);
//                break;
//            }
//        }
//    }

    @Override
    public void kosarbaRak(Termek termek) {
        if (kosarArray[(kosarArray.length - 1)] != null) {
            System.out.println("A kosár tele van!");
        } else {
            for (int i = 0; i < kosarArray.length; i++) {
                if (kosarArray[i] == null) {
                    kosarArray[i] = termek;
                    System.out.println("Beletettük a kosárba a " + termek.getName() + " nevű terméket!");
                    break;
                }
            }
        }
    }

    @Override
    public void kosarbolKivesz(Termek termek) {
        for (int i = kosarArray.length - 1; i >= 0; i--) {
            if (kosarArray[i] == termek) {
                kosarArray[i] = null;
                System.out.println("Kivettük a kosárból a " + termek.getName() + " nevű terméket!");
                break;
            }
        }
    }

    public Termek[] getKosarArray() {
        return kosarArray;
    }

    public void setKosarArray(Termek[] kosarArray) {
        this.kosarArray = kosarArray;
    }

    public int kosarbanLevoTermekekSzama() {
        int termekekSzama = 0;
        for (int i = 0; i < kosarArray.length; i++) {
            if (kosarArray[i] != null) {
                termekekSzama++;
            }

        }
        return termekekSzama;
    }

    public void printKosar() {
        System.out.println("A kosár tartalma: ");
        for (int i = 0; i < kosarArray.length; i++) {
            if (kosarArray[i] != null)
                System.out.println(kosarArray[i].getName());
        }
    }

}
