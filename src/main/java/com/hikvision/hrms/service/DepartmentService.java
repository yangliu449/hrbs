package com.hikvision.hrms.service;

import com.hikvision.hrms.mapper.DepartmentMapper;
import com.hikvision.hrms.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author : yangliu449
 * @date :  2019/1/28
 */
@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;


    public List<Department> findDepartments(Map<String, Object> map) {
        return departmentMapper.findDepartments(map);
    }

    public Integer getCount(Map<String, Object> map) {
        return departmentMapper.getCount(map);
    }

    public Integer addDepartment(Department department) {
        return  departmentMapper.addDepartment(department);
    }

    public Integer updateDepartment(Department department) {
        return departmentMapper.updateDepartment(department);
    }

    public Integer deleteDepartment(Integer id) {
        Integer flag = null;
        try {
            flag = departmentMapper.deleteDepartment(id);
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return flag;
    }
}
