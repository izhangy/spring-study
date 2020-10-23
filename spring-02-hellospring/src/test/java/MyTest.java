import com.spring.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author When all else is lost the future still remains.
 * @date 2020/10/14 - 11:24
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }
}
