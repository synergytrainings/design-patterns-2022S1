import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonsterTest {
	@Test
	void test() {
		// FlyingMonster.getBuilder(100).heightInCM(110).heightInInches(120) doesn't compile
		Monster monster = FlyingMonster.getBuilder(100).heightInCM(110).addEyes(3).addHeads(3).addNoise("Gruuh!!!").build();

		assertEquals(3, monster.eyesCount);
		assertEquals(3, monster.headsCount);
		assertEquals(0, monster.hornsCount);
		assertEquals(110, monster.height);

		Monster dragon = Dragon.getBuilder(200, 300).heightInInches(100).build();

		assertEquals(2, dragon.eyesCount);
		assertEquals(1, dragon.headsCount);
		assertEquals(0, dragon.hornsCount);
		assertEquals(254, dragon.height);

		try {
			FlyingMonster.getBuilder(100).heightInCM(110).addEyes(50);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
