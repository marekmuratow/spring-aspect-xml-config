package pl.entito.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreeterService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void greet() {
		logger.info("Hello from a controller");
	}
}
