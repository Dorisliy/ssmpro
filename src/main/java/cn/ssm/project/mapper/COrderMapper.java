package cn.ssm.project.mapper;

import cn.ssm.project.pojo.COrder;
import cn.ssm.project.pojo.COrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface COrderMapper {
    int countByExample(COrderExample example);

    int deleteByExample(COrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(COrder record);

    int insertSelective(COrder record);

    List<COrder> selectByExample(COrderExample example);

    COrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") COrder record, @Param("example") COrderExample example);

    int updateByExample(@Param("record") COrder record, @Param("example") COrderExample example);

    int updateByPrimaryKeySelective(COrder record);

    int updateByPrimaryKey(COrder record);
}