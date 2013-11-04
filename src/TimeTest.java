//package com.vogella.junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {
	private Time t1;
	private Time t2;

	
	/*public void init() {
	t1 = new Time();
	t1 = new Time();
	}*/
	
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

	@Test
	public final void testGetDuration() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetTimeOfWeek() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetDay() {
		assertEquals("Tue", Time.getDay(2000));
	}

	@Test
	public final void testGetTimeOfDay() {
		int[] expected = new int[]{11,10};
		assertArrayEquals(expected, Time.getTimeOfDay(3550));
	}

	@Test
	public final void testPrintTimeOfWeek() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testOverlap() {
		t1 = new Time();
		t2 = new Time();
		t1.setTimeOfWeek(2050);
		t2.setTimeOfWeek(2000);
		t1.setDuration(75);
		t2.setDuration(75);
		assertTrue(Time.overlap(t1,t2));
		
	}

	@Test
	public final void testMain() {
		fail("Not yet implemented"); // TODO
	}

}
