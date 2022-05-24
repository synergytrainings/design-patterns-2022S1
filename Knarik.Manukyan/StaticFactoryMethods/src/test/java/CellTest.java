import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

	@Test
	void test(){
		Cell prokaryoticCell = Cell.createProkaryoticCell(1, true);
		Cell eukaryoticCell = Cell.createEukaryoticCell(10, false);

		assertTrue(prokaryoticCell.isUnicellular);
		assertFalse(eukaryoticCell.hasCapsule);

		Cell animalCell = Cell.createEukaryoticCell(10,0,true);
		Cell plantCell = Cell.createEukaryoticCell(10,10,true);

		assertEquals("Animal Cell", animalCell.getType());
		assertEquals("Plant Cell", plantCell.getType());
	}

}
