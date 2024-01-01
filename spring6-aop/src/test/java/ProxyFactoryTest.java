import com.codermast.spring.Calculator;
import com.codermast.spring.CalculatorLogImpl;
import com.codermast.spring.ProxyFactory;
import org.junit.jupiter.api.Test;

public class ProxyFactoryTest {
    @Test
    public void testDynamicProxy(){
        ProxyFactory factory = new ProxyFactory(new CalculatorLogImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(1,0);
    }
}
