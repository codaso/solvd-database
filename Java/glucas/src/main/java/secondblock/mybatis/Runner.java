package com.lucas.solvd.secondblock.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Runner {

    public static <Blog> void main(String[] args) throws IOException {
        String resource = "org/mybatis/example/mybatis-config.xml.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            Blog blog = session.selectOne(
                    "org.mybatis.example.BlogMapper.selectBlog", 101);
        }

        try (SqlSession session = sqlSessionFactory.openSession()) {
            PlayerMapper mapper = session.getMapper(PlayerMapper.class);
            // do work
        }
    }
}
