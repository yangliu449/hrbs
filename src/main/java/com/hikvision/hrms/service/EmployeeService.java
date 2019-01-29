package com.hikvision.hrms.service;

import com.hikvision.hrms.mapper.EmployeeMapper;
import com.hikvision.hrms.model.Employee;
import com.hikvision.hrms.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author : yangliu449
 * @date :  2019/1/28
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public List<Post> findEmployees(Map<String, Object> map) {
        return  employeeMapper.findEmployees(map);
    }

    public Integer getCount(Map<String, Object> map) {
        return employeeMapper.getCount(map);
    }

    public Integer addEmployee(Employee employee) {
        Integer flag = null;
        try {
            //如果插入主键重复，抛出异常
            flag = employeeMapper.addEmployee(employee);
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return flag;
    }

    public Integer updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    public Integer deleteEmployee(String id) {
        return employeeMapper.deleteEmployee(id);
    }
}
