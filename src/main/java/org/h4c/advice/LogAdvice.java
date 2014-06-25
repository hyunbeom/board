package org.h4c.advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	
	private static Logger logger = Logger.getLogger(LogAdvice.class);
	
	public Object checkTime(ProceedingJoinPoint pjp)throws Throwable{
		Object result = null;
		
		long start = System.currentTimeMillis();
		
		result = pjp.proceed();
		
		long end = System.currentTimeMillis();
		
		logger.info(pjp.getSignature()+" : Time"+ (end-start));
		
		return result;
		
	}

}