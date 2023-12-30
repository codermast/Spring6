import com.codermast.spring6.iocxml.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        // 导入 bean 的 xml 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 通过 applicationContext 来获取 user 对象
        // 1.根据 id 获取对象
        User user1 = (User) context.getBean("user");
        // 调用 user 对象的 run 方法
        user1.run();
        System.out.println("1 根据 id 获取的 User 对象" + user1);

        // 2.根据类型获取对象
        User user2 = context.getBean(User.class);
        user2.run();
        System.out.println("2 根据 类型 获取的 User 对象" + user2);

        // 3.同时根据id和类型获取对象
        User user3 = context.getBean("user", User.class);
        user3.run();
        System.out.println("3 同时根据 id 和 类型 获取的 User 对象" + user3);
    }
}
