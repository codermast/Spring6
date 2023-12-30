import com.codermast.spring6.iocxml.bean.autowire.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByXML {

    @Test
    public void testAutoWireByXML() {
        ApplicationContext acByName = new ClassPathXmlApplicationContext("autowire-byName.xml");
        UserController userControllerByName = acByName.getBean(UserController.class);
        userControllerByName.saveUser();

        ApplicationContext acByType = new ClassPathXmlApplicationContext("autowire-byType.xml");
        UserController userControllerByType = acByType.getBean(UserController.class);
        userControllerByType.saveUser();
    }
}
