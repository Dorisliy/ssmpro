package cn.ssm.project.mapper;

import cn.ssm.project.pojo.ToMsfeeDetail;
import cn.ssm.project.pojo.ToMsfeeDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToMsfeeDetailMapper {
    int countByExample(ToMsfeeDetailExample example);

    int deleteByExample(ToMsfeeDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToMsfeeDetail record);

    int insertSelective(ToMsfeeDetail record);

    List<ToMsfeeDetail> selectByExample(ToMsfeeDetailExample example);

    ToMsfeeDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToMsfeeDetail record, @Param("example") ToMsfeeDetailExample example);

    int updateByExample(@Param("record") ToMsfeeDetail record, @Param("example") ToMsfeeDetailExample example);

    int updateByPrimaryKeySelective(ToMsfeeDetail record);

    int updateByPrimaryKey(ToMsfeeDetail record);
}