package cn.ssm.project.mapper;

import org.apache.ibatis.annotations.Param;
import cn.ssm.project.pojo.ToFbafeeRule;
import cn.ssm.project.pojo.ToFbafeeRuleExample;

import java.util.List;

public interface ToFbafeeRuleMapper {
    int countByExample(ToFbafeeRuleExample example);

    int deleteByExample(ToFbafeeRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToFbafeeRule record);

    int insertSelective(ToFbafeeRule record);

    List<ToFbafeeRule> selectByExample(ToFbafeeRuleExample example);

    ToFbafeeRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToFbafeeRule record, @Param("example") ToFbafeeRuleExample example);

    int updateByExample(@Param("record") ToFbafeeRule record, @Param("example") ToFbafeeRuleExample example);

    int updateByPrimaryKeySelective(ToFbafeeRule record);

    int updateByPrimaryKey(ToFbafeeRule record);
}