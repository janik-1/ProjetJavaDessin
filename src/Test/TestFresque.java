package Test;

import Dessin.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFresque {

	@Test
	public void testnotNull() {
		Fresque fresque = new Fresque();
		assertNotNull(fresque);
	}

}
