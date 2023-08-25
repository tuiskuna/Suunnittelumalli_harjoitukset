package factorymethod;

import factorymethod.juomat.Vesi;
import factorymethod.ruoat.Lohi;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    };
    
    public Ruoka createRuoka() {
    	return new Lohi();
    }

}
