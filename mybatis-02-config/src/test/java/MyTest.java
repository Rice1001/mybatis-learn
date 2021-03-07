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

    @Test
    public void getById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User u = userMapper.getById(3);
        System.out.println(u);
    }

    @Test
    public void delete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.delete(2);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void add(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.add(new User(4,"tang","345"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void update(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.update(new User(3,"hang","908"));

        sqlSession.commit();
        sqlSession.close();
    }
}
