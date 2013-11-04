import static org.junit.Assert.*;

import org.junit.Test;


public class TimeTest3 {
	private Time t1;

	@Test
	public final void testSetTimeOfWeek() {
		t1 = new Time();
		t1.setTimeOfWeek(1000);
		assertEquals(1000, t1.getTimeOfWeek());
	}

	@Test
	public final void testSetDuration() {
		t1 = new Time();
		t1.setDuration(75);
		assertEquals(75, t1.getDuration());
	}

}
