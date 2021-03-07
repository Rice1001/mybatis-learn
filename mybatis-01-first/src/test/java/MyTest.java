import com.fan.dao.UserMapper;
import com.fan.pojo.User;
import com.fan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2021/3/7 9:28
 */
public class MyTest {

    @Test
    public void test(){
       SqlSession sqlSession = MybatisUtils.getSqlSession();
       UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
