package gracefulsoul.creational.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(FactroyType factroyType) {
		switch (factroyType) {
			case SHAPE:
				return new ShapeFactory();
			case COLOR:
				return new ColorFactory();
			default:
				return null;
		}
	}

}
