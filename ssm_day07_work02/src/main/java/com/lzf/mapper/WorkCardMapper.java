package com.lzf.mapper;

import com.lzf.pojo.Employee;
import com.lzf.pojo.WorkCard;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.lzf.mapper
 * @version:1.0
 */
public interface WorkCardMapper {
    WorkCard queryWorkCard(@Param("cardId") Integer cardId);
}
