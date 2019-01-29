package com.hikvision.hrms.mapper;

import com.hikvision.hrms.model.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author : yangliu449
 * @date :  2019/1/28
 */
@Mapper
@Repository
public interface DepartmentMapper {
    /** 根据条件查询部门
     *
     * @param map
     * @return
     */
    public List<Department> findDepartments(Map<String, Object> map);

    /** 根据条件查询部门数量
     *
     * @param map
     * @return
     */
    public Integer getCount(Map<String, Object> map);

    /** 添加部门
     *
     * @param department
     * @return
     */
    public Integer addDepartment(Department department);

    /** 修改部门
     *
     * @param department
     * @return
     */
    public Integer updateDepartment(Department department);

    /** 删除部门
     *
     * @param id
     * @return
     */
    public Integer deleteDepartment(Integer id);

}
