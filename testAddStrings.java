package jUnitTestingPackage;
//Surya Raghuvanshi
//E20CSE0036
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		String result = jUnit.AddStrings("Surya", "Raghuvanshi");
		assertEquals("SuryaRaghuvanshi", result);
	}

}
