import com.fan.dao.UserMapper;
import com.fan.pojo.User;
import com.fan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
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

    @Test
    public void getById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User u = userMapper.getById(3);
        System.out.println(u);

        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        Logger logger = Logger.getLogger(MyTest.class);
        logger.info("info:进入了testlog4j");
        logger.debug("debug:进入了testlog4j");
        logger.error("error:进入了testlog4j");
    }

}
