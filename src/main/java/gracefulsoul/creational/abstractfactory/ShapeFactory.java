package gracefulsoul.creational.abstractfactory;

import gracefulsoul.creational.abstractfactory.color.Color;
import gracefulsoul.creational.abstractfactory.color.ColorType;
import gracefulsoul.creational.abstractfactory.shape.Circle;
import gracefulsoul.creational.abstractfactory.shape.Rectangle;
import gracefulsoul.creational.abstractfactory.shape.Shape;
import gracefulsoul.creational.abstractfactory.shape.ShapeType;
import gracefulsoul.creational.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType shapeType) {
		switch (shapeType) {
			case CIRCLE:
				return new Circle();
			case RECTANGLE:
				return new Rectangle();
			case SQUARE:
				return new Square();
			default:
				return null;
		}
	}

	@Override
	public Color getColor(ColorType colorType) {
		return null;
	}

}
