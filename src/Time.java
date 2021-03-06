//package com.vogella.junit.first;

//import com.vogella.junit.first.Time;

public class Time {
private int timeOfWeek;

private int duration;

public void setTimeOfWeek (int time) {
	this.timeOfWeek = time;
}

public void setDuration (int time) {
	this.duration = time;
}

public int getDuration() {
	return this.duration;
}

public int getTimeOfWeek() {
	return this.timeOfWeek;
}

public static String getDay(int t) {
	//String day;
	if (t < 1440)
		return "Mon";
	else if (t < 2880)
		return "Tue";
	else if (t < 4320)
		return "Wed";
	else if (t < 5760)
		return "Thu";
	else if (t < 7200)
		return "Fri";
	else return "weekend";
	//return day;
}
	
/*public String getDay() {	
	return this.day;
}*/

public static int[] getTimeOfDay(int t) {
	int dayTime, min, hr;
	int[] timeDay = {0,0};
	if (getDay(t).equals("Tue"))
		dayTime = t - 1440;
	else if (getDay(t).equals("Wed"))
		dayTime =t - 2880;
	else if (getDay(t).equals("Thu"))
		dayTime = t - 4320;
	else if (getDay(t).equals("Fri"))
		dayTime = t - 5760;
	else if (getDay(t).equals("Mon"))
		dayTime = t;
	else dayTime = 0;
	hr = (int) dayTime/60;
	min = dayTime - 60*hr;
	timeDay[0] = hr;
	timeDay[1] = min;
	return timeDay;
}

public void printTimeOfWeek() {
	if (getTimeOfDay(timeOfWeek)[1] < 10)
		System.out.println(getDay(timeOfWeek) + " " + getTimeOfDay(timeOfWeek)[0] + ":" + "0" + getTimeOfDay(timeOfWeek)[1] + " " + getDuration());
	else System.out.println(getDay(timeOfWeek) + " " + getTimeOfDay(timeOfWeek)[0] + ":" + getTimeOfDay(timeOfWeek)[1] + " " + getDuration());
}

public static boolean overlap(Time t1, Time t2) {
	return (!(((t1.getTimeOfWeek() + t1.getDuration()) < t2.getTimeOfWeek()) || 
			(t1.getTimeOfWeek() > (t2.getTimeOfWeek() + t2.getDuration())))
			);
}

public static void main(String[] args) {
	Time t1 = new Time();
	Time t2 = new Time();
	Time t3 = new Time();
	Time t4 = new Time();
	t1.setTimeOfWeek(1500);
	t1.setDuration(75);
	System.out.println("First class");
	t1.printTimeOfWeek();
	t2.setTimeOfWeek(3550);
	t2.setDuration(75);
	System.out.println("Second class");
	t2.printTimeOfWeek();
	System.out.println("Overlap? " + overlap(t1,t2));
	System.out.println("1st class absolute time - " + t1.getTimeOfWeek());
	System.out.println("2nd class absolute time - " + t2.getTimeOfWeek());
	System.out.println();
	t3.setTimeOfWeek(3500);
	t3.setDuration(75);
	System.out.println("First class");
	t3.printTimeOfWeek();
	t4.setTimeOfWeek(3550);
	t4.setDuration(75);
	System.out.println("Second class");
	t4.printTimeOfWeek();
	System.out.println("Overlap? " + overlap(t3,t4));
	System.out.println("1st class absolute time - " + t3.getTimeOfWeek());
	System.out.println("2nd class absolute time - " + t4.getTimeOfWeek());
}
}
