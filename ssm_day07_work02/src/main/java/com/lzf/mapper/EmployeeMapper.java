package com.lzf.mapper;

import com.lzf.pojo.Employee;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.lzf.mapper
 * @version:1.0
 */
public interface EmployeeMapper {
    Employee queryEmp(Integer empId);
}
