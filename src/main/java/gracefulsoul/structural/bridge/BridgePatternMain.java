package gracefulsoul.structural.bridge;

import gracefulsoul.structural.bridge.draw.GreenCircle;
import gracefulsoul.structural.bridge.draw.RedCircle;
import gracefulsoul.structural.bridge.shape.Circle;
import gracefulsoul.structural.bridge.shape.Shape;

public class BridgePatternMain {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

}
