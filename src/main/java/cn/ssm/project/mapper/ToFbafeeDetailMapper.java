package cn.ssm.project.mapper;

import org.apache.ibatis.annotations.Param;
import cn.ssm.project.pojo.ToFbafeeDetail;
import cn.ssm.project.pojo.ToFbafeeDetailExample;

import java.util.List;

public interface ToFbafeeDetailMapper {
    int countByExample(ToFbafeeDetailExample example);

    int deleteByExample(ToFbafeeDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToFbafeeDetail record);

    int insertSelective(ToFbafeeDetail record);

    List<ToFbafeeDetail> selectByExample(ToFbafeeDetailExample example);

    ToFbafeeDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToFbafeeDetail record, @Param("example") ToFbafeeDetailExample example);

    int updateByExample(@Param("record") ToFbafeeDetail record, @Param("example") ToFbafeeDetailExample example);

    int updateByPrimaryKeySelective(ToFbafeeDetail record);

    int updateByPrimaryKey(ToFbafeeDetail record);
}