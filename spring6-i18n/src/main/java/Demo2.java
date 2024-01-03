import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;
import java.util.Locale;

public class Demo2 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //传递动态参数，使用数组形式对应{0} {1}顺序
        Object[] objs = new Object[]{"codermast",new Date().toString()};

        //www.codermast.com为资源文件的key值,
        //objs为资源文件value值所需要的参数,Local.CHINA为国际化为语言
        String str=context.getMessage("www.codermast.com", objs, Locale.CHINA);
        System.out.println(str);
    }
}