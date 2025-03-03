package com.mst.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	
	@Before("execution(* com.mst.bean.Account.deposit(..))")
	public void logBefore (JoinPoint joinPoint)
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("logBefore is Running ");
		System.out.println("this will run before deposite method ");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	
	
	@After("execution(* com.mst.bean.Account.*(..))")
	public void logAfter (JoinPoint joinPoint)
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("logAfter is Running ");
		System.out.println("this will run before deposit method ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	@AfterReturning(pointcut = "execution(* com.mst.bean.Account.getAccountNumber(..)" ,returning= "result")
	public void logAfterReturnning(JoinPoint joinpoint , Object result) {

		System.out.println("----------------------------------------------------");
		System.out.println("logAfterReturning() is running!");
		System.out.println("the  : " + joinpoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("----------------------------------------------------");
		
	 }
	
	@AfterThrowing (pointcut = "execution(* com.mst.bean.Account.deposit(..)" ,throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint , Throwable error)
	{
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("logAfterThrowing() is running!");
		System.out.println("the : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	}
	
	 @Around("execution(* com.mst.bean.Account.withdraw(..))")
	   public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		 System.out.println("/////////////////////////////////////////////////////////");
		System.out.println("logAround() is running!");
		
			
		System.out.println("Around before is running!");
		joinPoint.proceed(); //continue on the intercepted method
		System.out.println("Around after is running!");
			
		System.out.println("/////////////////////////////////////////////////////////");
	   }
}
