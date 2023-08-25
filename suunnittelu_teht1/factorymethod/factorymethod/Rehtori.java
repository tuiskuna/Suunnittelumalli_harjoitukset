package factorymethod;

import factorymethod.juomat.Viini;
import factorymethod.ruoat.Pihvi;

public class Rehtori extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Viini();
    }

	
	public Ruoka createRuoka() {
		return new Pihvi();
	};
}
