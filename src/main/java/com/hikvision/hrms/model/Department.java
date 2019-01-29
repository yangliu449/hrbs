package com.hikvision.hrms.model;

/**
 * @author : yangliu449
 * @date :  2019/1/28
 * Department 类（部门）
 */
public class Department {
    private Integer id;  // 部门编号
    private String name;  // 名称
    private String description;  // 描述

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
