package org.zerock.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServerTime {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now)); 




	}

}
