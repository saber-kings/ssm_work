package com.lzf.mapper;

import com.lzf.domain.Hero;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/16
 * @Description:com.lzf.mapper
 * @version:1.0
 */
public interface HeroMapper {
    //查询所有英雄
    List<Hero> findAll();
    //根据id查询
    Hero findById(Integer id);
    //添加英雄
    void insertHero(Hero user);
    //修改英雄
    void updateHero(Hero user);
    //根据id 删除英雄
    void deleteHero(Integer id);

    //根据姓名名和密码查询
    Hero findNP(@Param("name") String name, @Param("password") String password);
}
