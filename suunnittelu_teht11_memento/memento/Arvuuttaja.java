
public class Arvuuttaja {

    class Memento {
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
        System.out.println("Pelaajan "+ pelaaja.getPelaajaNumero() + " luku: " + arvottuLuku);
        return new Memento(arvottuLuku);    //palautetaan memento pelaajalle
    }

     public synchronized boolean arvaa(Object o, int arvaus) {
        Memento memento = (Memento)o; //cast object mementoksi
        if (arvaus == memento.getNumber()) {
            return true;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}