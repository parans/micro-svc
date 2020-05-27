package hello;

import org.joda.time.LocalTime;

import msc.ControllerRegistry;

public class HelloWorld {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		
		ControllerRegistry cr = new HelloWorldCr();
		cr.controllers().stream().forEach( c -> {
			c.init();
		});
	}
}
