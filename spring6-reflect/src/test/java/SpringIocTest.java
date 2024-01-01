import com.codermast.reflect.core.AnnotationApplicationContext;
import com.codermast.reflect.core.ApplicationContext;
import com.codermast.reflect.service.UserService;
import org.junit.jupiter.api.Test;

public class SpringIocTest {

    @Test
    public void testIoc() {
        ApplicationContext applicationContext = new AnnotationApplicationContext("com.codermast.reflect");
        UserService userService = (UserService)applicationContext.getBean(UserService.class);
        userService.out();
        System.out.println("run success");
    }
}