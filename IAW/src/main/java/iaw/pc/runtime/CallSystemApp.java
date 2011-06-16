package iaw.pc.runtime;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallSystemApp {
	private static Logger logger = Logger.getLogger(CallSystemApp.class);

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/integration/phonecall.xml",
				CallSystemApp.class);

		context.start();
	}
}
