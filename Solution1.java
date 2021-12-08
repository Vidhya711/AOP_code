import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 
public class Solution1 
{

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("C:\\Users\\Kasturi\\eclipse-workspace\\AOP\\src\\applicationContext.xml");
		Operation e=(Operation)context.getBean("op");
		System.out.println("Calling first method");
		e.first();
		System.out.println("Calling second method");
		e.second();
		System.out.println("Calling second method");
		e.third();	
	}

}