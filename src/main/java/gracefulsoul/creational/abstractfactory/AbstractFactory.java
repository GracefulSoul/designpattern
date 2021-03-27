package gracefulsoul.creational.abstractfactory;

import gracefulsoul.creational.abstractfactory.color.Color;
import gracefulsoul.creational.abstractfactory.color.ColorType;
import gracefulsoul.creational.abstractfactory.shape.Shape;
import gracefulsoul.creational.abstractfactory.shape.ShapeType;

public abstract class AbstractFactory {

	abstract Color getColor(ColorType colorType);

	abstract Shape getShape(ShapeType shapeType);

}
