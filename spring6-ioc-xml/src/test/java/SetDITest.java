import com.codermast.spring6.iocxml.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetDITest {
    @Test
    public void setDiTest(){
        // 1.导入 beans-di 配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-di.xml");
        // 2. 创建 Student 对象
        Student studentOne = ac.getBean("studentOne", Student.class);
        // 3. 打印 Student 对象
        System.out.println(studentOne);
    }
}
