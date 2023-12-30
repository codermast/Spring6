import com.codermast.spring6.iocxml.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {

    @Test
    public void testBeanScope() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-scope.xml");
        // 多例模式下创建的对象
        User user1 = ac.getBean("userPrototype",User.class);
        User user2 = ac.getBean("userPrototype",User.class);
        System.out.println("多例模式下的对象判断" + (user1 == user2));

        // 单例模式下创建的对象
        User user3 = ac.getBean("userSingleton",User.class);
        User user4 = ac.getBean("userSingleton",User.class);
        System.out.println("单例模式下的对象判断" + (user3 == user4));
    }
}
