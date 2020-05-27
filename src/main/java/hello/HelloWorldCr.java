package hello;

import java.util.LinkedList;
import java.util.List;

import msc.Controller;
import msc.ControllerRegistry;

public class HelloWorldCr implements ControllerRegistry {

	@Override
	public List<Controller> controllers() {
		LinkedList<Controller> crl = new LinkedList<>();
		crl.add(new Greeter());
		return crl;
	}

}
