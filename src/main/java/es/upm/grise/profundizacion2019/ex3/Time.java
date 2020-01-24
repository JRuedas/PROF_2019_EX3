package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	private LocalDateTime currentTime;
	
	public Time(LocalDateTime currentTime) {
		this.currentTime = currentTime;
	}
	
	public String getFutureTime(long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		currentTime.plusSeconds(seconds);
		return formatter.format(currentTime);	
	}

}
