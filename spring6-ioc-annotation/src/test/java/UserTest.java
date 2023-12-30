import com.codermast.spring6.bean.User;
import com.codermast.spring6.controller.UserController;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {
    @Test
    public void userTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean(User.class);
        System.out.println(user);

        User user1 = context.getBean("user", User.class);
        System.out.println(user1);
    }


    private Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void testAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.out();
        logger.info("执行成功");
    }
}
