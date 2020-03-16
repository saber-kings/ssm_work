package com.lzf.mapper;

import com.lzf.domain.Hero;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/16
 * @Description:com.lzf.mapper
 * @version:1.0
 */
public class HeroMapperTest {
    private InputStream inputStream;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private HeroMapper heroMapper;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        heroMapper = sqlSession.getMapper(HeroMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void findAll() {
        List<Hero> heroList = heroMapper.findAll();
        for (Hero hero : heroList) {
            System.out.println(hero);
        }
    }

    @Test
    public void findById() {
        Hero hero = heroMapper.findById(3);
        System.out.println(hero);
    }

    @Test
    public void insertHero() {
        Hero hero = new Hero();
        hero.setName("Misaka_Mikoto");
        hero.setPassword("railgun");
        hero.setNickname("御坂美琴");
        heroMapper.insertHero(hero);
        System.out.println("恭喜你,添加成功!");
    }

    @Test
    public void updateHero() {
        //先根据id查询
        Hero hero = heroMapper.findById(4);

        hero.setName("Diarmuid_Ua_Duibhne");

        heroMapper.updateHero(hero);
        System.out.println("恭喜你,修改成功了!");
    }

    @Test
    public void deleteHero() {
        heroMapper.deleteHero(1);
    }

    @Test
    public void findNP() {
        Hero hero = heroMapper.findNP("Archer", "hero_king");
        System.out.println(hero);
    }
}