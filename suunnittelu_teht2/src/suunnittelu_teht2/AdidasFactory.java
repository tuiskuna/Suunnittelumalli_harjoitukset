package suunnittelu_teht2;

public class AdidasFactory implements AbstractFactory{

	@Override
	public Farmarit createFarmarit() {
		return new AdidasFarmarit();
	}

	@Override
	public Kengat createKengat() {
		return new AdidasKengat();
	}

	@Override
	public TPaita createTpaita() {
		return new AdidasTpaita();
	}

	@Override
	public Lippis createLippis() {
		return new AdidasLippis();
	}

	
	
}
