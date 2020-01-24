package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

public class smokeTest {
	
	private final static String EXPECTED_DATE = "2020/01/01 00:00:00";
	private final static long SECONDS_TO_ADD = 120L;
	private final static LocalDateTime CURRENT_DATE = LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0);
	
	private Time time;
	
	MyClass my;
	
	@Before
	public void setUp() {
		my = new MyClass();
		time = new Time(CURRENT_DATE);
	}

	@Test
	public void timeTest() {
						
		String futureDate = time.getFutureTime(SECONDS_TO_ADD);
		
		assertEquals(EXPECTED_DATE, futureDate);
	}
}
