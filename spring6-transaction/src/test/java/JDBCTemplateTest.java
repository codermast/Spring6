import com.codermast.spring6.bean.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JDBCTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    //测试增删改功能
    public void testUpdate(){
        //添加功能
        String sql = "insert into t_emp values(null,?,?,?)";
        int result = jdbcTemplate.update(sql, "张三", 23, "男");

        //修改功能
        //String sql = "update t_emp set name=? where id=?";
        //int result = jdbcTemplate.update(sql, "codermast", 1);

        //删除功能
        //String sql = "delete from t_emp where id=?";
        //int result = jdbcTemplate.update(sql, 1);
    }

    @Test
    public void testSelectObject() {
        //写法一
//        String sql = "select * from t_emp where id=?";
//        Emp empResult = jdbcTemplate.queryForObject(sql,
//                (rs, rowNum) -> {
//                    Emp emp = new Emp();
//                    emp.setId(rs.getInt("id"));
//                    emp.setName(rs.getString("name"));
//                    emp.setAge(rs.getInt("age"));
//                    emp.setSex(rs.getString("sex"));
//                    return emp;
//                }, 1);
//        System.out.println(empResult);

        //写法二
        String sql = "select * from t_emp where id=?";
        Emp emp = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Emp.class),1);
        System.out.println(emp);
    }


    @Test
    //查询多条数据为一个list集合
    public void testSelectList(){
        String sql = "select * from t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }

    @Test
    //查询单行单列的值
    public void selectCount(){
        String sql = "select count(id) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}
