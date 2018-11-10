package pl.entito.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void around(ProceedingJoinPoint joinPoint) {

		try {
			logger.info("Aspect before: " + joinPoint.getSignature().toShortString());
			joinPoint.proceed();
			logger.info("Aspect after: " + joinPoint.getSignature().toShortString());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
