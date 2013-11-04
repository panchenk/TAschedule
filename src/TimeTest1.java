import static org.junit.Assert.*;

import org.junit.Test;


public class TimeTest1 {

	@Test
	public final void testGetDay() {
		assertEquals("Tue", Time.getDay(2000));
	}

	@Test
	public final void testGetTimeOfDay() {
		int[] expected = new int[]{11,10};
		assertArrayEquals(expected, Time.getTimeOfDay(3550));
	}

}
