package cn.ssm.project.mapper;

import org.apache.ibatis.annotations.Param;
import cn.ssm.project.pojo.ToMcffeeDetail;
import cn.ssm.project.pojo.ToMcffeeDetailExample;

import java.util.List;

public interface ToMcffeeDetailMapper {
    int countByExample(ToMcffeeDetailExample example);

    int deleteByExample(ToMcffeeDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToMcffeeDetail record);

    int insertSelective(ToMcffeeDetail record);

    List<ToMcffeeDetail> selectByExample(ToMcffeeDetailExample example);

    ToMcffeeDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToMcffeeDetail record, @Param("example") ToMcffeeDetailExample example);

    int updateByExample(@Param("record") ToMcffeeDetail record, @Param("example") ToMcffeeDetailExample example);

    int updateByPrimaryKeySelective(ToMcffeeDetail record);

    int updateByPrimaryKey(ToMcffeeDetail record);
}