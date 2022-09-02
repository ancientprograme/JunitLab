import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
	GradeBook g1;
	GradeBook g2;

	@Before
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(52);
		g1.addScore(44);

		g2 = new GradeBook(5);
		g2.addScore(04);
		g2.addScore(97);

	}

	@After
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("52.0 44.0 "));

		assertEquals(g1.getScoresSize(),2);
		assertEquals(g2.getScoresSize(),2);
	}
	@Test
	public void testSum() {
		assertEquals(96,g1.sum(),.0001);
		assertEquals(101,g2.sum(),.0001);
	}
	@Test 
	public void testMinimum() {
		assertEquals(44,g1.minimum(),.001);
		assertEquals(4,g2.minimum(),.001);
	}
	@Test 
	public void finalScore() {
		assertEquals(52,g1.finalScore(),.0001);
		assertEquals(97,g2.finalScore(),.0001);
	}

}
