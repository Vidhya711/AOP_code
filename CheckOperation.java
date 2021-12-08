import org.aspectj.lang.JoinPoint;  
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before;  
import org.aspectj.lang.annotation.Pointcut;  
@Aspect
public class CheckOperation 
{

	 @Pointcut("execution(* Operation.*(..))")  
	  public void second(){}
      
	    @Before("second()")
	    public void myadvice(JoinPoint jp) 
	    {  
	        System.out.println("additional concern");  
	    }
}
