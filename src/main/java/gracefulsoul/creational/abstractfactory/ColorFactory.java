package gracefulsoul.creational.abstractfactory;

import gracefulsoul.creational.abstractfactory.color.Blue;
import gracefulsoul.creational.abstractfactory.color.Color;
import gracefulsoul.creational.abstractfactory.color.ColorType;
import gracefulsoul.creational.abstractfactory.color.Green;
import gracefulsoul.creational.abstractfactory.color.Red;
import gracefulsoul.creational.abstractfactory.shape.Shape;
import gracefulsoul.creational.abstractfactory.shape.ShapeType;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType shapeType) {
		return null;
	}

	@Override
	public Color getColor(ColorType colorType) {
		switch (colorType) {
			case RED:
				return new Red();
			case GREEN:
				return new Green();
			case BLUE:
				return new Blue();
			default:
				return null;
		}
	}

}
