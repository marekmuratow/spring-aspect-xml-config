package pl.entito.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		GreeterService greeter = (GreeterService) context.getBean(GreeterService.class);
		greeter.greet();

		context.close();
	}

}
