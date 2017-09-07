package cn.ssm.project.mapper;

import cn.ssm.project.pojo.COrderLine;
import cn.ssm.project.pojo.COrderLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface COrderLineMapper {
    int countByExample(COrderLineExample example);

    int deleteByExample(COrderLineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(COrderLine record);

    int insertSelective(COrderLine record);

    List<COrderLine> selectByExample(COrderLineExample example);

    COrderLine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") COrderLine record, @Param("example") COrderLineExample example);

    int updateByExample(@Param("record") COrderLine record, @Param("example") COrderLineExample example);

    int updateByPrimaryKeySelective(COrderLine record);

    int updateByPrimaryKey(COrderLine record);
}