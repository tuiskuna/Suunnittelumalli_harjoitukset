package suunnittelu_teht5;

public class BossFactory implements AbstractFactory {

	//singleton
	private static BossFactory instance = null;

	private BossFactory() {}

	public static BossFactory getInstance() {
		if (instance == null) {
			instance = new BossFactory();
		}
		return instance;
	}

	@Override
	public Farmarit createFarmarit() {
		return new BossFarmarit();
	}

	@Override
	public Kengat createKengat() {
		return new BossKengat();
	}

	@Override
	public TPaita createTpaita() {
		return new BossTpaita();
	}

	@Override
	public Lippis createLippis() {
		return new BossLippis();
	}

}
