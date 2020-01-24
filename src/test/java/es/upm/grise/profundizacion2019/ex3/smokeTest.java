package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

public class smokeTest {
	
	private final static String EXPECTED_DATE = "2020/01/01 00:00:00";
	private final static long SECONDS_TO_ADD = 120L;
	private final static LocalDateTime CURRENT_DATE = LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0);
	private final static int NUMBER_OF_INTERACTIONS = 1;
	
	private Time time;
	private MyClass myClass;
	
	@Mock
	private Time timeMock;
	
	@Before
	public void setUp() {
		
		MockitoAnnotations.initMocks(this);
		
		time = new Time(CURRENT_DATE);
		myClass = new MyClass(timeMock);
	}

	@Test
	public void timeTest() {
						
		String futureDate = time.getFutureTime(SECONDS_TO_ADD);
		
		assertEquals(EXPECTED_DATE, futureDate);
	}
	
	@Test
	public void myClassTest() {
		
		myClass.nextTime(SECONDS_TO_ADD);
		verify(timeMock, times(NUMBER_OF_INTERACTIONS)).getFutureTime(SECONDS_TO_ADD);
	}
}
