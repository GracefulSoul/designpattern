package gracefulsoul.structural.flyweight.shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	// Uncomment the compiler directive line and javac *.java will compile properly.
	// @SuppressWarnings("unchecked")
	private static final Map<String, Circle> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);
		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}

}
