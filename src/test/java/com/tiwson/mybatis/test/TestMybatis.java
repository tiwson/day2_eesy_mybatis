package com.tiwson.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.junit.Test;

import java.io.InputStream;

/**
 * 测试Mybatis的CRUD操作
 */
public class TestMybatis {
    @Test
    public void TestFindAll() throws Exception {
        //1、读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
    }
}
