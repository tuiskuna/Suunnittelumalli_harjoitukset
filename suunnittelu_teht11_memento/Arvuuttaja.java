
public class Arvuuttaja {

    private class Memento {
        private final int number;

        public Memento(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    public Memento liityPeliin(Pelaaja pelaaja) {
        int arvottuLuku = 1 + (int)(Math.random() * 10);
        System.out.println("Pelaajan "+ pelaaja.getNimi() + " luku: " + arvottuLuku);
        return new Memento(arvottuLuku);    //palautetaan memento pelaajalle
    }

     public boolean arvaa(Object o, int arvaus, String nimi) {
        Memento memento = (Memento)o; //cast object mementoksi
        //jos arvaus oikein: voitti pelin
        if (arvaus == memento.getNumber()) {
            System.out.println("oikea luku!");
            return true;
        }
        return false;
    }
}