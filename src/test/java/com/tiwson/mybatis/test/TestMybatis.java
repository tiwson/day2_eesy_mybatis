package com.tiwson.mybatis.test;

import com.tiwson.mybatis.bean.User;
import com.tiwson.mybatis.dao.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 测试Mybatis的CRUD操作
 */
public class TestMybatis {
    @Test
    public void TestFindAll() throws Exception {
        //1、读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        //3、创建SqlSession
        SqlSession sqlSession = sessionFactory.openSession();
        //4、创建IUserDao代理类
        IUserDao dao = sqlSession.getMapper(IUserDao.class);
        //5、查询所有用户
        List<User> users = dao.findAll();
        for(User user : users) {
            System.out.println(user);
        }
        //6、释放资源
        sqlSession.close();
        in.close();
    }
}
