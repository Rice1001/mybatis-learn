import com.fan.dao.UserMapper;
import com.fan.pojo.User;
import com.fan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2021/3/10 15:04
 */
public class MyTest {

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getAll();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

}
