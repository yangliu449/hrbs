package com.hikvision.hrms.mapper;

import com.hikvision.hrms.model.Position;
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
public interface PositionMapper {

    /** 根据条件查询职位
     *
     * @param map
     * @return
     */
    public List<Position> findPositions(Map<String, Object> map);

    /** 根据条件查询职位数量
     *
     * @param map
     * @return
     */
    public Integer getCount(Map<String, Object> map);

    /** 添加职位
     *
     * @param position
     * @return
     */
    public Integer addPosition(Position position);

    /** 修改职位
     *
     * @param position
     * @return
     */
    public Integer updatePosition(Position position);

    /** 删除职位
     *
     * @param id
     * @return
     */
    public Integer deletePosition(Integer id);

}
