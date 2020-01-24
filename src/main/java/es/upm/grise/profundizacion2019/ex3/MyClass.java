package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;

public class MyClass {
	
	public void nextTime(long seconds) {
		Time time = new Time(LocalDateTime.now());
		String next = time.getFutureTime(seconds);
		System.out.println(next);
	}

}
