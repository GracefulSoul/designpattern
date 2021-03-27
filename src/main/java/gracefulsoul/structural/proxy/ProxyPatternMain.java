package gracefulsoul.structural.proxy;

import gracefulsoul.structural.proxy.image.Image;
import gracefulsoul.structural.proxy.image.ProxyImage;

public class ProxyPatternMain {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// Image will be loaded from disk
		image.display();

		// Image will not be loaded from disk
		image.display();
	}

}