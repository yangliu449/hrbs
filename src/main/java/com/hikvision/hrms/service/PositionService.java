package com.hikvision.hrms.service;

import com.hikvision.hrms.mapper.PositionMapper;
import com.hikvision.hrms.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author : yangliu449
 * @date :  2019/1/28
 */
@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;

    public List<Position> findPositions(Map<String, Object> map) {
        return positionMapper.findPositions(map);
    }
    public Integer getCount(Map<String, Object> map) {
        return positionMapper.getCount(map);
    }

    public Integer addPosition(Position position) {
        return positionMapper.addPosition(position);
    }

    public Integer updatePosition(Position position) {
        return  positionMapper.updatePosition(position);
    }

    public Integer deletePosition(Integer id) {
        Integer flag = null;
        try {
            flag = positionMapper.deletePosition(id);
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return flag;
    }
}
