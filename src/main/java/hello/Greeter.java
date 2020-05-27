package hello;

import msc.Controller;
import msc.ServiceHandler;
import msc.Verb;

public class Greeter extends ServiceHandler implements Controller {
	
	public String sayHello() {
		return "Hello world!";
	}

	@Override
	public void init() {
		registerHandler(Verb.GET, "/hello", (req, res) -> {
			return sayHello();
		});
		
		registerHandler(Verb.GET, "/hello/:name", (req, res) -> {
			return "Hello, " + req.params(":name");
		});
	}
}
