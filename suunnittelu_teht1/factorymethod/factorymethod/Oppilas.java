package factorymethod;

import factorymethod.juomat.Maito;
import factorymethod.ruoat.Nakkikeitto;

public class Oppilas extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Maito();
    }

	public Ruoka createRuoka() {
		return new Nakkikeitto();
	};
}
