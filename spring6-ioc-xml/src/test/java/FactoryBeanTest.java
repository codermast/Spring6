import com.codermast.spring6.iocxml.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {
    @Test
    public void testUserFactoryBean(){
        //获取IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-factorybean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
        System.out.println(user.getClass());
    }
}
