package com.hikvision.hrms.service;

import com.hikvision.hrms.mapper.AdminMapper;
import com.hikvision.hrms.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;
import java.util.Map;

/**
 * @author : yangliu449
 * @date :  2019/1/28
 */
@Service
public class AdminService implements AdminMapper {
    @Autowired
    AdminMapper adminMapper;
    public Admin login(Admin admin) {
        return adminMapper.login(admin);
    }

    public List<Admin> findAdmins(Map<String, Object> map) {
        return adminMapper.findAdmins(map);
    }

    public Integer getCount(Map<String, Object> map) {
        return  adminMapper.getCount(map);
    }
    public Integer addAdmin(Admin admin) {
        return  adminMapper.addAdmin(admin);
    }

    public Integer updateAdmin(Admin admin) {
        return  adminMapper.updateAdmin(admin);
    }
    public Integer deleteAdmin(Integer id) {
        return adminMapper.deleteAdmin(id);
    }
}
