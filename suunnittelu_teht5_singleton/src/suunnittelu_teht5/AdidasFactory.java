package suunnittelu_teht5;

public class AdidasFactory implements AbstractFactory{

	//singleton käyttöön
	private static AdidasFactory instance = null;

	private AdidasFactory() {}

	public static AdidasFactory getInstance() {
		if (instance == null) {
			instance = new AdidasFactory();
		}
		return instance;
	}
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
