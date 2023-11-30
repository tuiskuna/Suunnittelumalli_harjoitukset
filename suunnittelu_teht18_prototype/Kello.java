public class Kello implements Cloneable {

    Viisari minuuttViisari;
    Viisari tuntViisari;
    
    public Kello() {
        tuntViisari = new Viisari(24);
        minuuttViisari = new Viisari(60);
    };

    public void vaihdaAika(int tunnit, int minuutit){
        tuntViisari.asetaAika(tunnit);
        minuuttViisari.asetaAika(minuutit);
    }

    public String toString(){
        return "Kello on " + tuntViisari.getAika() + ":" + minuuttViisari.getAika();
    }

    // deep copy = kopioidaan myös oliot eikä vain viittauksia
   @Override
    public Kello clone(){
        Kello k =null;
        try{
            k =(Kello)super.clone();
            k.tuntViisari = (Viisari)tuntViisari.clone();
            k.minuuttViisari= (Viisari)minuuttViisari.clone();
        }catch (CloneNotSupportedException e){}
        
        return k;
    }
    // @Override
    // public Kello clone() {
    //     try {
    //         return (Kello)super.clone();
    //     } catch (CloneNotSupportedException e) {
    //         return null;
    //     }
    // }
        
}
