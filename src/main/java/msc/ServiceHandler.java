package msc;

import static spark.Spark.*;

import spark.Route;

public class ServiceHandler {
	protected void registerHandler(Verb verb, String route, Route handler) {
		switch(verb) {
		case GET:
			get(route, handler);
			break;
		case PUT:
			put(route, handler);
			break;
		case POST:
			post(route, handler);
			break;
		case PATCH:
			patch(route, handler);
			break;
		case DELETE:
			delete(route, handler);
			break;
		}	
	}
}
