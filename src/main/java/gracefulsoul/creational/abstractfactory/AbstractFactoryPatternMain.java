package gracefulsoul.creational.abstractfactory;

import gracefulsoul.creational.abstractfactory.color.Color;
import gracefulsoul.creational.abstractfactory.color.ColorType;
import gracefulsoul.creational.abstractfactory.shape.Shape;
import gracefulsoul.creational.abstractfactory.shape.ShapeType;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {

		// Get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactroyType.SHAPE);

		// Get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);

		// Call draw method of Shape Circle
		shape1.draw();

		// Get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);

		// Call draw method of Shape Rectangle
		shape2.draw();

		// Get an object of Shape Square
		Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);

		// Call draw method of Shape Square
		shape3.draw();

		// Get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactroyType.COLOR);

		// Get an object of Color Red
		Color color1 = colorFactory.getColor(ColorType.RED);

		// Call fill method of Red
		color1.fill();

		// Get an object of Color Green
		Color color2 = colorFactory.getColor(ColorType.GREEN);

		// Call fill method of Green
		color2.fill();

		// Get an object of Color Blue
		Color color3 = colorFactory.getColor(ColorType.BLUE);

		// Call fill method of Color Blue
		color3.fill();
	}

}
