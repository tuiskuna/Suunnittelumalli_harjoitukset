public class Viisari implements Cloneable {
    protected int aika;
    protected int max; 

    public Viisari(int max) {
        this.aika = 0;
        this.max = max;
    }

    public void asetaAika(int aika) {
        this.aika = aika;
    }

    public void liiku() {
        if(aika + 1 > max) {
            aika = 0;
        }
        aika++;
        }

    public int getAika() {
        return this.aika;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
