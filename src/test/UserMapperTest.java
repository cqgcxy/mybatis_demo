import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author icechen1219
 * @created 18-8-23
 */
public class UserMapperTest {
    Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Test
    public void countTest() {
        String resource = "mybatis-config.xml";
        try (InputStream is = Resources.getResourceAsStream(resource)) {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

            int count = 0;
            SqlSession sqlSession = null;
            sqlSession = factory.openSession();

            count = sqlSession.selectOne("com.cqgcxy.dao.UserMapper.count");
            logger.debug("UserMapperTest count--->" + count);
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
