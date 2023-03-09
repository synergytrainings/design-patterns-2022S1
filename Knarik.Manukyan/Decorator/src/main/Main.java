package main;

import main.Decorators.*;
import main.Decorators.stone.Stone;
import main.Decorators.stone.StoneType;

public class Main {

	public static void main(String[] args) {
		Ring ringWithDesign = new RingWithDesign(
				new SimpleRing(100, 16.5, 10), 20);

		Stone diamond = new Stone(StoneType.DIAMOND, 1, 100);

		Stone sapphire = new Stone(StoneType.SAPPHIRE, 1, 50);

		Ring ringWithStones = new RingWithStone(new RingWithStone(ringWithDesign, diamond, 20), sapphire, 20);

		Ring ringWithEngraving = new RingWithEngraving(ringWithStones,
				"One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them.", 20);


		System.out.println(ringWithEngraving.getDescription());

		System.out.println("The price is " + ringWithEngraving.getPrice() + "$");

		System.out.println("The weight is " + ringWithEngraving.getWeight() + "g");
	}
}
