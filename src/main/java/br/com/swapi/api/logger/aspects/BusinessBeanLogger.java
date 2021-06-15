package br.com.swapi.api.logger.aspects;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Aspecto para logar informações do objeto Bean
 * 
 * @author Clayton Morais de Oliveira
 *
 */
@Aspect
@Component
public class BusinessBeanLogger {


	@Around("@annotation(LoggerBean)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
	    long start = System.currentTimeMillis();	 
	    Object proceed = joinPoint.proceed();
	    
	    long executionTime = System.currentTimeMillis() - start;
	    
	    MethodSignature signature = (MethodSignature) joinPoint.getSignature();	    
	    Method method = signature.getMethod();
	    LoggerBean loggerBeanAnnotation = method.getAnnotation(LoggerBean.class);
	    loggerBeanAnnotation.value().logger(
	    		LogManager.getLogger(
	    				joinPoint.getSignature().getClass()), 
	    				new StringBuilder(joinPoint.getSignature().toLongString())
	    				.append("executado em ")
	    				.append(executionTime)
	    				.append(" ms")
	    				.toString());	    
	    return proceed;
	}	

}
