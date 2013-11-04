import static org.junit.Assert.*;

import org.junit.Test;


public class TimeTest2 {
	private Time t1;
	private Time t2;

	@Test
	public final void testOverlap() {
		t1 = new Time();
		t2 = new Time();
		t1.setTimeOfWeek(2050);
		t2.setTimeOfWeek(2000);
		t1.setDuration(75);
		t2.setDuration(75);
		assertTrue(Time.overlap(t1,t2));
		t1.setTimeOfWeek(3050);
		t2.setTimeOfWeek(2000);
		assertFalse(Time.overlap(t1,t2));
	}

}
