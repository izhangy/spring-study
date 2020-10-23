import com.spring.dao.UserDaoImpl;
import com.spring.dao.UserDaoMysqlImpl;
import com.spring.service.UserService;
import com.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author When all else is lost the future still remains.
 * @date 2020/10/14 - 10:50
 **/
public class MyTest {
    public static void main(String[] args) {

        //用户实际调用的是业务层接口
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
//        userService.getUser();
//        获取applicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
